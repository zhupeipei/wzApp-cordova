<template>
<div>
    <router-view></router-view>
    <footer>
      <tabbar>
        <tabbar-item>
          <img slot="icon" src="../assets/tabbar.png">
          <span slot="label">Wechat</span>
        </tabbar-item>
        <tabbar-item show-dot>
          <img slot="icon" src="../assets/tabbar.png">
          <span slot="label">Message</span>
        </tabbar-item>
        <tabbar-item selected link="/component/demo">
          <img slot="icon" src="../assets/tabbar.png">
          <span slot="label">Explore</span>
        </tabbar-item>
        <tabbar-item badge="2">
          <img slot="icon" src="../assets/tabbar.png">
          <span slot="label">News</span>
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
