<template>
  <div class="header">
    <!--<span class="iconfont icon-fanhui" id="backicon">返回</span>-->
    <span>{{title}}</span>
    <span class="iconfont icon-share" id="shareicon"> </span>
  </div>
</template>

<script>
  export default {
    props: {
      title: {
        type: String
      }
    },
    data() {
      return {};
    },
    methods: {}
  };
</script>

<style scoped>
  .header {
    width: 100%;
    height: 44px;
    line-height: 44px;
    text-align: center;
    background-color: #11b4f5;
    color: #fff;
    font-size: 1rem;
    position: fixed;
    left: 0px;
    top: 0px;
    z-index: 100;
  }
  .header span {
    color: #fff;
    font-size: 1.125rem;
  }
  #shareicon {
    width: 45px;
    float: right;
    text-align: right;
    margin-right: 4px;
  }
  #backicon {
    width: 55px;
    float: left;
  }
</style>
