package basic.ch15.sec05.LIFO_FIFO_Good;

import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {
  public static void main(String[] args) {
    Queue<Message> messageQueue = new LinkedList<>();

    // 데이터 삽입 (구체적인 타입 사용)
    messageQueue.offer(new MailMessage("홍길동"));
    messageQueue.offer(new SMSMessage("신용권"));
    messageQueue.offer(new KakaotalkMessage("감자바"));

    // 처리 로직이 매우 단순해짐
    // 새로운 전송수단 추가되어도 while문 수정 필요X, 새로운 클래스만 추가
    while (!messageQueue.isEmpty()) {
      Message message = messageQueue.poll();
      if (message != null) {
        message.execute(); // 다형성에 의해 각 클래스의 메서드가 실행됨
      }
    }
  }
}
