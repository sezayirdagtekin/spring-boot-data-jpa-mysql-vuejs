<template>
  <div class="container">
    <h3 class="font-weight-bold text-justify">{{pageHeader}}</h3>
    <div>
      <form>
        <div class="form-group">
          <label for="forTitle" class="font-weight-bold">Title</label>
          <input
            type="text"
            v-model="attribute.title"
            class="form-control"
            id="forTitle"
            placeholder="Please enter  attribute title"
          />
        </div>

        <div class="form-group">
          <label for="forCombo" class="font-weight-bold">Type</label>
          <select class="form-control" v-model="attribute.type" id="forCombo">
          <option v-for="item in optionTypes" :value="item" v-bind:key="item">{{item}}</option>
          </select>
        </div>
        <div class="form-group my-3">
          <button type="button" class="btn btn-success mr-2" v-on:click="save">Save</button>
          <button type="button" class="btn btn-secondary" v-on:click="clear">Clear</button>
        </div>
      </form>
    </div>
    <div>
      <table class="table table-hover">
        <thead class="thead-dark">
          <tr>
            <th>Title</th>
            <th>Type</th>
          </tr>
        </thead>
        <tbody>
          <tr v-for=" item in atrArray" :key="item.title">
            <td>{{item.title}}</td>
            <td>{{item.type}}</td>
          </tr>
        </tbody>
      </table>
    </div>
  </div>
</template>

<script>
import "bootstrap/dist/css/bootstrap.css";
import "bootstrap-vue/dist/bootstrap-vue.css";

export default {
  name: "Attribute",
  props: {
    msg: String
  },
  data() {
    return {
      attribute: {
        title: "",
        type: ""
      },
      atrArray: [],
      optionTypes: ['Text','File','Multi Select'],
      pageHeader: "Admin Page"
    };
  },

  async created() {
    console.log("Inside Atribute created hook..");
    this.getAttributessAsync();
  },

  methods: {
    async getAttributessAsync() {
      try {
        console.log("get all attributes..");
        const response = await this.$axios.get("/attributes");
        this.atrArray = response.data;
      } catch (error) {
        this.errors.push(error);
      }
    },
    async save() {
      try {
        const response = await this.$axios.post("/add", this.attribute);
        console.log("saved attribute  is:" + JSON.stringify(response.data));
        //Lad lsit again
        this.getAttributessAsync();
         this.clear()
      } catch (error) {
        console.log(error);
      }
    },
    clear() {
      console.log("Call clear method");
      this.attribute.title = "";
    }
  }
};
</script>

<!-- Add "scoped" attribute to limit CSS to this component only -->
<style scoped>
h3 {
  margin: 40px 0 0;
}
ul {
  list-style-type: none;
  padding: 0;
}
li {
  display: inline-block;
  margin: 0 10px;
}
a {
  color: #42b983;
}
</style>
