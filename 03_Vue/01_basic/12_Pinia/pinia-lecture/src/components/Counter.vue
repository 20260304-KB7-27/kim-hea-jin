<template>
  <h3>반응형으로 꺼내기 : {{ counter.count }}</h3>
  <h3>값만 꺼내기 : {{ count }}</h3>
  <button @click="increment">증가</button>
  <button @click="reset">초기화</button>
</template>

<script setup>
import { useCounterPersistStore } from '@/stores/persist/persist_counter';

// import { useCounterStore } from '@/stores/counter';

// 객체 자체를 꺼내오는 방식
// counter.count로 참조 필요
// const counter = useCounterStore();

const counter = useCounterPersistStore();

// 구조분해할당으로 꺼내는 방식
// count, increment 그대로 사용 가능 
// state(반응형 데이터)의 값 복사한 것이므로 반응형 깨짐
// const { count, increment, reset } = useCounterStore();

const {count, increment, reset} = useCounterPersistStore();
</script>

<style scoped></style>
