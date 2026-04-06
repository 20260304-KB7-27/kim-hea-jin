import { ref, computed } from 'vue';
import { defineStore } from 'pinia';

export const useLikePersistStore = defineStore(
  'like-persist',
  () => {
    const like = ref(0);

    const fivetime = computed(() => like.value * 5);

    const increment = () => {
      like.value++;
    };

    return { like, fivetime, increment };
  },
  {
    persist: {
      key: 'like-p', // storage에 저장될 key 이름 (default: storeID)
      storage: sessionStorage, // 저장할 storage 지정 (deafult: localStorage)
      pick: ['like'], // 저장하고 싶은 상태값 지정 가능
    },
  },
);
