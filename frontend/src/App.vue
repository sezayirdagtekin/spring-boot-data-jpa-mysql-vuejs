<template>
  <div id="app">
    <img  class="img-fluid" alt="Vue logo" src="./assets/logo.png">
    <attribute msg="Welcome to Your Vue.js App"/>
  </div>
</template>

<script>
import Attribute from './components/Attribute.vue'

export default {
  name: 'App',
  components: {
   attribute: Attribute
  }
}
</script>

<style>
#app {
  font-family: Avenir, Helvetica, Arial, sans-serif;
  -webkit-font-smoothing: antialiased;
  -moz-osx-font-smoothing: grayscale;
  text-align: center;
  color: #2c3e50;
  margin-top: 60px;
}
</style>
