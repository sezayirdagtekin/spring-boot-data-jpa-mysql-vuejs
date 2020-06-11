<template>
  <div class="container">
   
   <h3 class="font-weight-bold text-justify">   {{msg}} </h3>

    <form>
      <div class="form-group">
        <label for="forFulname" class="font-weight-bold">Full name</label>
        <input
          type="text"
          v-model="person.fullname"
          class="form-control"
          id="forFulname"
          placeholder="Sezayir Dagtekin"
        />
      </div>
      <div class="form-group">
        <label for="forMobile" class="font-weight-bold">Mobile phone</label>
        <input
          type="number"
          class="form-control"
          v-model="person.gsm"
          id="forMobile"
          placeholder="905324441000"
        />
      </div>

      <div class="form-group">
        <label for="forEmail" class="font-weight-bold">Email address</label>
        <input
          type="email"
          class="form-control"
          v-model="person.email"
          id="forEmail"
          placeholder="sezayir99@netflix.com"
        />
      </div>
      <div class="form-group">
        <label for="forCombo" class="font-weight-bold">Attribute</label>
        <select class="form-control" v-model="person.attribute" id="forCombo">
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
  name: "Usermanagement",
  props: {
    msg: String
  },
  data() {
    return {
      person: {
        fullname: "",
        email: "",
        gsm: "",
        attribute: "Text"
      }
    };
  },
  methods: {
    save() {
      console.log("call save method:" + this.person.fullname);
    },
    clear() {
      console.log("call clear method");
      this.person.fullname = ""
      this.person.email = ""
      this.person.gsm = ""
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
