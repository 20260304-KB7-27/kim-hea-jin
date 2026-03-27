<template>
  <div>
    X : <input type="text" v-model.number="x" /><br />
    Y : <input type="text" v-model.number="y" /><br />
  </div>
</template>

<!-- no setup -->
<script>
import { ref } from 'vue';

export default {
  // name: component_name
  name: 'Calc',

  setup() {
    const x = ref(10);
    const y = ref(20);

    // setup()으로 선언한 변수 반환
    return { x, y };
  },
};
</script>

<style scoped></style>
