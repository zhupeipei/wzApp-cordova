<template>
<div>
    <router-view></router-view>
    <footer>
      <tabbar>
        <tabbar-item selected link="/home">
          <img slot="icon" src="../assets/tabbar.png">
          <span slot="label">首页</span>
        </tabbar-item>
        <tabbar-item show-dot link="/tool">
          <img slot="icon" src="../assets/tabbar.png">
          <span slot="label">工具</span>
        </tabbar-item>
        <tabbar-item link="/message">
          <img slot="icon" src="../assets/tabbar.png">
          <span slot="label">消息</span>
        </tabbar-item>
        <tabbar-item badge="2" link="/my">
          <img slot="icon" src="../assets/tabbar.png">
          <span slot="label">我的</span>
        </tabbar-item>
      </tabbar>
    </footer>
</div>
</template>
<script>
import { Tabbar, TabbarItem } from 'vux'
export default {
  components: {
    Tabbar,
    TabbarItem
  },
  data() {
    return {}
  },
  methods: {
  }
}
</script>
<style></style>
