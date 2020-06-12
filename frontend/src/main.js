import Vue from 'vue'
import App from './App.vue'
import { BootstrapVue, IconsPlugin } from 'bootstrap-vue'
// Install BootstrapVue
Vue.use(BootstrapVue)
// Optionally install the BootstrapVue icon components plugin
Vue.use(IconsPlugin)

//install  axios
import axios from 'axios'
const axiosInstance = axios.create({
  baseURL: "http://localhost:8081/api"
});

Vue.prototype.$axios = axiosInstance;
//Vue.prototype.$http = axios

import VueRouter from 'vue-router'
import routes from './routes';

Vue.config.productionTip = false

Vue.use(VueRouter);

const router = new VueRouter({
  mode: 'history',
  routes
});


new Vue({
  render: h => h(App),
  router
}).$mount('#app')
