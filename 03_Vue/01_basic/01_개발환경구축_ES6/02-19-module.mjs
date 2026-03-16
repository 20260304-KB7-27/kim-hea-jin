let base = 100;
const add = (x) => base+x;
const multiply = (x) => base*x;
const getBase = () => base;

export {add, multiply};
export default getBase;

// 직접 export 
// export const add = (x) => base+x;
// export const multiply = (x) => base*x;
// export defult () => base;
