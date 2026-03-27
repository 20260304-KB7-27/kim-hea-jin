<template>
  <div>
    X : <input type="text" v-model.number="state.x" /><br />
    Y : <input type="text" v-model.number="state.y" /><br />
  </div>
  <button @click="CalcAdd">계산</button><br />
  <div>결과: {{ state.result }}</div>
</template>

<script>
import { reactive, toRefs } from 'vue';

export default {
  name: 'Calc3',

  // 3개의 변수를 한 객체로 묶어 반응형으로 변환
  setup() {
    const state = reactive({ x: 10, y: 20, result: 20 });

    const CalcAdd = () => {
      state.result = state.x + state.y;
    };

    /* 
    reactive()
     - 객체 전용 반응형 API (Object, Array, Map, Set)
     - 속성에 직접 접근 ([객체명].[속성명])
     - Proxy로 반응형 주입

    ref()
     - 모든 타입 가능 (num 같은 원시값 포함)
     - .value로 접근 ([반응형데이터명].value)
     - Wrapper 형태, 반응형 객체로 감싸 반응형을 주입
    */

    return { 
      // toRefs: reactive 객체의 각 속성을 ref로 반환 (반응형 유지)
      // ...toRefs(state),
      state, 
      CalcAdd };
  },
};
</script>

<style scoped></style>
