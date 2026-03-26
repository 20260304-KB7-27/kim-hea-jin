<template>
  <div>
    <label>{{ label }}</label>
    <input
      type="text"
      :value="modelValue"
      :placeholder="placeholder"
      @input="emit('update:modelValue', $event.target.value)"
    />
  </div>
</template>

<script setup>
// 부모에서 전달받은 props(읽기전용, 수정불가) 정의
const props = defineProps(['modelValue', 'label', 'placeholder']);

// 부모로 전달할 emit
// update:모델이름 규칙 지켜야 v-model과 연동
// 'update:모델이름' v-model="모델이름" 동일해야함
const emit = defineEmits(['update:modelValue']);
</script>

<style scoped></style>
