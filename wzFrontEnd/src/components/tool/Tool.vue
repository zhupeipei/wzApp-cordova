<template>
  <div>
    <page-header :title="title"></page-header>
    Tool
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
        title: "工具"
      }
    },
    methods: {}
  }
</script>
<style></style>
