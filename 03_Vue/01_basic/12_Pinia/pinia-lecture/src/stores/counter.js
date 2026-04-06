import { ref } from 'vue';
import { defineStore } from 'pinia';

/*
Pinia
- Vue3에서 사용하는 상태 관리 라이브러리
- 전역 상태(반응형 데이터) 관리 가능

1. state -> 데이터
2. getters -> 계산된 값
3. actions -> 함수 (비즈니스 로직) API 요청, state 변경 함수 등
*/

// 'counter': store의 고유 id 값 (중복X)
export const useCounterStore = defineStore('counter', () => {
  // state
  // localStorage.getItem(key) : value 읽어오기
  const count = ref(Number(localStorage.getItem('local-count')) || 0);

  // actions
  function increment() {
    count.value++;

    // localStorage
    // localStorage.setItem(key, value) : key, value 설정해 저장
    // 브라우저를 닫아도 데이터 유지 (명시적으로 삭제 전까지 보관)
    // 로그인 상태, 사용자 설정에 주로 사용
    localStorage.setItem('local-count', count.value);
  }

  function reset() {
    count.value = 0; // 초기화

    localStorage.setItem('local-count', 0);
  }

  return { count, increment, reset };
});
