package lecture.queue;

import java.util.LinkedList;
import java.util.Queue;

// [Queue]
public class Application1 {
  public static void main(String[] args) {

    // [Queue]
    // FIFO(선입선출)
    // 주요 메서드
    // - offer(): 요소 추가, 실패 시 false 반환 (add()는 실패 시 예외 발생)
    // - peek(): 가장 앞 요소 반환
    // - poll(): 가장 앞 요소 반환 후 제거

    Queue<String> que = new LinkedList<>();

    que.offer("first");
    que.offer("second");
    que.offer("third");

    System.out.println("que.peek() = " + que.peek());  // first
    System.out.println("que.poll() = " + que.poll());  // first
    System.out.println("que.peek() = " + que.peek());  // second

  }
}
