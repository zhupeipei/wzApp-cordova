import Vue from 'vue'
import Router from 'vue-router'
import Home from '@/components/home/Home'
import Tool from '@/components/tool/Tool'
import Message from '@/components/message/Message'
import My from '@/components/my/My'
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
        },
        {
          path: 'tool',
          component: Tool
        },
        {
          path: 'message',
          component: Message
        },
        {
          path: 'my',
          component: My
        },
      ]
    }
  ]
})
