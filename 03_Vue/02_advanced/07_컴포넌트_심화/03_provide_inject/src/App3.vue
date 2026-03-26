<template>
  <div>
    <h2>비동기 컴포넌트</h2>

    <AsyncComp></AsyncComp>
  </div>
</template>

<script setup>
import { defineAsyncComponent } from 'vue';
import LoadingComp from './components/LoadingComp.vue';
import ErrorComp from './components/ErrorComp.vue';

// 옵션 없이 사용
// const AsyncComp = defineAsyncComponent(
//   () => import('./components/AsyncComponent.vue'),
// );

/*
defineAsyncComponent 사용 시점
 - 초기 로딩 속도 개선이 필요할 때 
 - 무겁거나(차트, 에디터) 자주 사용하지 않는 컴포넌트 
*/

// 옵션 적용
const AsyncComp = defineAsyncComponent({
  loader: () =>
    new Promise((resolve) => {
      setTimeout(() => {
        resolve(import('./components/AsyncComponent.vue'));
      }, 3000);
    }),
  loadingComponent: LoadingComp, // delay 이후 동작
  errorComponent: ErrorComp, // timeout 이후 or 오류 발생 시 동작
  delay: 200,
  timeout: 3000,
});
</script>

<style scoped></style>
