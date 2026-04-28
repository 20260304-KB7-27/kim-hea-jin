package lecture.list;

import java.util.Stack;

// [Stack]
public class Application2 {
  public static void main(String[] args) {

    // Stack
    // - 선형 메모리 공간에 데이터를 저장하며 LIFO(후입선출) 방식의 자료구조

    Stack<Integer> integerStack = new Stack<>();

    integerStack.push(1);
    integerStack.push(2);
    integerStack.push(3);
    integerStack.push(4);
    integerStack.push(5);

    System.out.println(integerStack);  // [1, 2, 3, 4, 5]

    // peek(): 가장 상단(마지막에 들어간)의 요소 반환
    // pop(): 가장 상단(마지막에 들어간)의 요소 반환 후 제거

//    System.out.println("integerStack.peek() = " + integerStack.peek());  // 5
//    System.out.println("integerStack.pop() = " + integerStack.pop());  // 5
//    System.out.println("integerStack.peek() = " + integerStack.peek());  // 4

    // search(n): 가장 상단(마지막으로 들어간, 오른쪽 끝)에서부터 센 n번째 값 반환
    System.out.println("integerStack.search(3) = " + integerStack.search(3));

    System.out.println("integerStack.pop() = " + integerStack.pop());
    System.out.println("integerStack.pop() = " + integerStack.pop());
    System.out.println("integerStack.pop() = " + integerStack.pop());
    System.out.println("integerStack.pop() = " + integerStack.pop());
    System.out.println("integerStack.pop() = " + integerStack.pop());
    // 빈 stack pop() -> EmptyStackException 예외 발생
    System.out.println("integerStack.pop() = " + integerStack.pop());
  }
}
