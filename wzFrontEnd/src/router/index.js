import Vue from 'vue'
import Router from 'vue-router'
import Home from '@/components/Home'
import Root from '@/components/Root'

Vue.use(Router)

export default new Router({
  routes: [
    {
      path: '/',
      redirect: '/home',
      name: 'Root',
      component: Root,
      children: [
        {
          path: 'home',
          component: Home
        }
      ]
    }
  ]
})
