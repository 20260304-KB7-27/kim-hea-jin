let obj = { result: 0 };

// JavaScript this 바인딩 문제
obj.add = function (x, y) {
  function inner() {
    // this: ?
    this.result = x + y;
  }
  // 일반함수 호출: this는 전역객체를 참조
  // inner 함수의 this는 global (node), window(전역객체)
  inner();
};

obj.add(3, 4);
console.log(obj);
console.log(result);
// 실행결과
// { result: 0, add: [Function (anonymous)] }
// 7

// 해결방법
// 1. 화살표 함수: 호출된 상위객체의 this을 가리킴
// let obj = { result: 0 };
// obj.add = function (x, y) {
//     // 화살표 함수 안의 this: 상위 scope의 this(obj)
//   const inner = () => {
//     this.result = x + y;
//   };

//   inner();
// };
// obj.add(3, 4);
// console.log(obj);  // { result: 7, add: [Function (anonymous)] }

// 2. bind()로 명시적 바인딩
// 함수의 this 값을 특정 객체의 영구적으로 바인딩한 새로운 함수 반환
// 첫번째 인자로 전달된 객체가 this로 설정
// let obj = { result: 0 };
// obj.add = function (x, y) {
//   const inner = () => {
//     this.result = x + y;
//   };
//   // inner 함수의 this를 obj 객체로 바인딩해 호출
//   inner.bind(obj)();
// };
// obj.add(3, 4);
// console.log(obj); // { result: 7, add: [Function (anonymous)] }
