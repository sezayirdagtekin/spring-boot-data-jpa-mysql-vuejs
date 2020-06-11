<template>
  <div class="container">
   
   <h3 class="font-weight-bold text-justify">   {{pageHeader}} </h3>

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
          <option>Text</option>
          <option>File</option>
          <option>Multi</option>
        </select>
      </div>
      <div class="form-group my-3">
        <button type="button" class="btn btn-primary mr-2" v-on:click="save">Save</button>
        <button type="button" class="btn btn-secondary" v-on:click="clear">Clear</button>
      </div>
    </form>
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
      pageHeader: "Welcome to admin page"
    };
  },
  methods: {
    save() {
      console.log("call save method:" + this.attribute.title);
    },
    clear() {
      console.log("call clear method");
      this.attribute.title = ""

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
