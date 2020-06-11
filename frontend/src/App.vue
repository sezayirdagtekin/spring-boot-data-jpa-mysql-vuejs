<template>
  <div id="app">
    <img  class="img-fluid" alt="Vue logo" src="./assets/logo.png">
    <nav>
        <router-link to='/admin' class="font-weight-bold">Admin</router-link>
        <router-link to='/user' class="font-weight-bold ml-2">User</router-link>
    </nav>
    <router-view />
  </div>
</template>

<script>

export default {
  name: 'App',
  components: {
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
