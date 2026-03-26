<template>
  <h1>동적 컴포넌트</h1>
  <hr />
  <div>
    <h1>태평양 전쟁의 해전</h1>

    <!-- 탭 나열 -->
    <ul>
      <li v-for="tab in tabs" :key="tab.id">
        <a @click="changeTab(tab.id)">
          {{ tab.label }}
        </a>
      </li>
    </ul>
    <!-- 선택한 탭의 내용 (동적 컨포넌트) -->
    <!-- keep-alive: cache 저장해 다시 화면 랜더링X -->
    <keep-alive>
      <component :is="currentTab"></component>
    </keep-alive>
  </div>
</template>

<script setup>
import { computed, ref } from 'vue';
import CoralSeaTab from './component/CoralSeaTab.vue';
import MidwayTab from './component/MidwayTab.vue';
import LeyteGulfTab from './component/LeyteGulfTab.vue';

/*
동적 컴포넌트
 - is 속성을 사용해 런타임에 랜더링할 컴포넌트를 동적으로 바꿀 수 있음
 - Tab UI / 스탭 UI 에서 사용
*/
// :is에 전달할 컴포넌트 객체
const tabComponents = {
  CoralSeaTab,
  LeyteGulfTab,
  MidwayTab,
};

// 선택된 탭
const currentTabName = ref('CoralSeaTab');

const currentTab = computed(() => tabComponents[currentTabName.value]);

const tabs = ref([
  { id: 'CoralSeaTab', label: '산호해 해전' },
  { id: 'MidwayTab', label: '미드웨이 해전' },
  { id: 'LeyteGulfTab', label: '레이테만 해전' },
]);

// 클릭 시 currentTabName 변경
function changeTab(tabId) {
  currentTabName.value = tabId;
}
</script>

<style scoped></style>
