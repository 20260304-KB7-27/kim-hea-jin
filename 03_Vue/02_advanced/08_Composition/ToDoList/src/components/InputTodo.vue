<template>
  <input type="text" v-model="todo" placeholder="3글자이상 입력" />
  <!-- 클릭 이벤트 발생 시 부모(App)에게 커스텀 이벤트(add-todo) 발송 -->
  <button @click="emit('add-todo', todo)">추가</button>
</template>

<script setup>
import { ref } from 'vue';

const todo = ref('');

const emit = defineEmits(['add-todo']);
</script>
