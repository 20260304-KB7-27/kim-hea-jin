<template>
  <h1>v-model 테스트</h1>
  <hr />
  <BaseInput
    v-model="modelValue"
    label="닉네임"
    placeholder="닉네임을 입력해주세요"
  ></BaseInput>

  <!-- 하나의 컴포넌트에 v-model 여러개 쓰고 싶을 경우 이름붙여 사용 -->
  <BaseInput
    v-model:modelValue="lastname"
    label="성"
    placeholder="성을 입력해주세요"
  ></BaseInput>

  <BaseInput
    v-model:modelValue="firstname"
    label="이름"
    placeholder="이름을 입력해주세요"
  ></BaseInput>

  <p>
    <!-- 자식 component에서 입력한 내용 부모 component에 보임 -->
    닉네임: <strong>{{ modelValue }}</strong>
  </p>
  <p>
    <!-- 자식 component에서 입력한 내용 부모 component에 보임 -->
    전체이름: <strong> {{ lastname }}{{ firstname }}</strong>
  </p>
</template>

<script setup>
import BaseInput from './components/BaseInput.vue';
import { ref } from 'vue';

// BaseInput에서 입력받을 반응형 데이터
// App -> BaseInput v-model로 전달
const modelValue = ref('');
const firstname = ref('');
const lastname = ref('');
</script>

<style scoped></style>
