<template>
  <div class="container">
    <div class="card card-body bg-light">
      <div class="title">:: Todolist App ::</div>
    </div>
    <div class="card card-default card-borderless">
      <div class="card-body">
        <InputTodo @add-todo="addTodo"></InputTodo>
        <TodoList
          :todoList="todoList"
          @delete-todo="deleteTodo"
          @toggle-completed="toggleCompleted"
        ></TodoList>
      </div>
    </div>
  </div>
</template>

<script setup>
import { ref } from 'vue';
import InputTodo from './components/InputTodo.vue';
import TodoList from './components/TodoList.vue';

const ts = new Date().getTime();

const todoList = ref([
  { id: ts, todo: '자전거 타기', completed: false },
  { id: ts + 1, todo: '딸과 공원 산책', completed: true },
  { id: ts + 2, todo: '일요일 애견 카페', completed: false },
  { id: ts + 3, todo: 'Vue 원고 집필', completed: false },
]);

const addTodo = (todo) => {
  if (todo.length >= 3) {
    todoList.value.push({
      id: new Date().getTime(),
      todo: todo,
      completed: false,
    });
  }
};

const deleteTodo = (id) => {
  let index = todoList.value.findIndex((item) => id === item.id);
  todoList.value.splice(index, 1);
};

const toggleCompleted = (id) => {
  let index = todoList.value.findIndex((item) => id === item.id);
  todoList.value[index].completed = !todoList.value[index].completed;
};
</script>
