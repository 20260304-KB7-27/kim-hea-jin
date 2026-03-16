// const
// 재할당 금지
// 객체 선언 -> heap에 data 저장, stack에 heap 주소 저장

const p1 = { name: 'john', age: 20 };

// 객체 내부 값은 변경가능
p1.age = 22;
console.log(p1);
// 실행 결과
// { name: 'john', age: 22 }

p1 = { name: 'lee', age: 25 };
// 새로운 객체 할당 불가, type error 발생
