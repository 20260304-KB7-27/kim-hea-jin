<template>
  <div>
    X : <input type="text" v-model.number="x" /><br />
    Y : <input type="text" v-model.number="y" /><br />
  </div>
  <button @click="CalcAdd">계산</button><br />
  <div>결과: {{ result }}</div>
</template>

<script>
import { ref } from 'vue';

export default {
  name: 'Calc2',

  setup() {
    const x = ref(10);
    const y = ref(20);
    const result = ref(30);

    // ref 사용 -> .value로 접근
    const CalcAdd = () => {
      result.value = x.value + y.value;
    };

    return { x, y, result, CalcAdd };
  },
};
</script>

<style scoped></style>
