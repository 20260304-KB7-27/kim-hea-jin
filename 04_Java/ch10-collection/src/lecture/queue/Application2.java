package lecture.queue;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

// [Deque]
public class Application2 {
  public static void main(String[] args) {

    // [Deque] (덱)
    // - Queue를 확장한 인터페이스, 양쪽 끝에서 삽입/삭제 가능
    // 주요 메서드
    // - offerFirst() / offerLast(): 가장 앞/뒤에 요소 추가, 실패 시 false 반환
    // - peekFirst() / peekLast(): 가장 앞/뒤 요소 반환
    // - pollFirst() / peekLast(): 가장 앞/뒤 요소 반환 후 제거

    Deque<String> deque = new ArrayDeque<>();

    deque.offerLast("middle");
    deque.offerFirst("front");
    deque.offerLast("end");

    System.out.println("deque = " + deque);  // deque = [front, middle, end]

    System.out.println("deque.peekFirst() = " + deque.peekFirst());  // front
    System.out.println("deque.peekLast() = " + deque.peekLast());  // end

    System.out.println("deque.pollFirst() = " + deque.pollFirst());  // front
    System.out.println("deque = " + deque);  // [middle, end]
    System.out.println("deque.pollLast() = " + deque.pollLast());  // end
    System.out.println("deque = " + deque);  // [middle]

  }
}
