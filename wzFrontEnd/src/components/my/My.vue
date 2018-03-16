<template>
  <div>
    <page-header :title="title"></page-header>
    My
  </div>
</template>
<script>
  import PageHeader from '../vendor/common/PageHeader.vue';

  export default {
    components: {
      PageHeader
    },
    data() {
      return {
        title: "我的"
      }
    },
    methods: {}
  }
</script>
<style></style>
