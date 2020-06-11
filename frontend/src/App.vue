<template>
  <div id="app">
    <img  class="img-fluid" alt="Vue logo" src="./assets/logo.png">
    <usermng msg="User Management"/>
  </div>
</template>

<script>
import Usermanagement from './components/Usermanagement.vue'

export default {
  name: 'App',
  components: {
   usermng: Usermanagement
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
