package lecture.queue;

import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Queue;

// [Priority Queue]
public class Application3 {
  public static void main(String[] args) {

    // PriorityQueue 우선순위 큐
    // - 우선순위가 높은 요소부터 꺼냄
    // - Comparable, Comparator 정렬 기준 변경 가능 (우선순위 지정가능)

    // 숫자형 default: 오름차순
    // Collections.reverseOrder(): 기본 정렬의 역순 Comparator
    Queue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());

    pq.offer(30);
    pq.offer(10);
    pq.offer(50);
    pq.offer(20);
    pq.offer(40);

    System.out.println(pq);  // [10, 20, 50, 30, 40] 정렬X

    // 작은 숫자부터(우선순위 기준) 출력
    while (!pq.isEmpty()) {
      System.out.println("pq.poll() = " + pq.poll());  // 10 20 30 40 50
      // Collections.reverseOrder() 적용 시 50 40 30 20 10
    }
  }
}
