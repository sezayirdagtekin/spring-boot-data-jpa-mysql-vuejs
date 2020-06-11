<template>

<div class="container">
  <form>
    <div class="form-group">
    <label for="forFulname"  class="font-weight-bold">Full Name</label>
    <input type="text" class="form-control" id="forFulname" placeholder="Sezayir Dagtekin">
  </div>
    <div class="form-group">
    <label for="forMobile"  class="font-weight-bold">Mobile Phone</label>
    <input type="number" class="form-control" id="forMobile" placeholder="905324441000">
  </div>

  <div class="form-group">
    <label for="forEmail"  class="font-weight-bold">Email address</label>
    <input type="email" class="form-control" id="forEmail" placeholder="sezayir99@netflix.com">
  </div>
  <div class="form-group">
    <label for="forCombo"  class="font-weight-bold">Attribute</label>
    <select class="form-control" id="forCombo">
      <option>Text</option>
      <option>File</option>
       <option>Multi</option>
    </select>

  </div>  
 <div class="form-group my-3">
  <button type="button" class="btn btn-primary mr-2">Save</button>
  <button type="button" class="btn btn-secondary">Clear</button>
  </div> 

</form>
 
</div>


</template>

<script>
import 'bootstrap/dist/css/bootstrap.css'
import 'bootstrap-vue/dist/bootstrap-vue.css'

export default {
  name: 'Attribute',
  props: {
    msg: String
  }
}
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
