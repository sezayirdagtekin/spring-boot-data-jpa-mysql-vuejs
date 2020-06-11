
import Attribute from './components/Attribute.vue';
import Usermanagement from './components/Usermanagement.vue';


const routes = [
    { path: '/', component: Attribute },
    { path: '/admin', component: Attribute },
    { path: '/user', component: Usermanagement },
];

export default routes;