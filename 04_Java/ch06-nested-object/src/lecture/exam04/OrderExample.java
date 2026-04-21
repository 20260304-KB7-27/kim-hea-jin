package lecture.exam04;

public class OrderExample {
  public static void main(String[] args) {

    OrderProcessor processor = new OrderProcessor();

    // 상황1) policy = null (할인 정책 없음)
    processor.orderProcess(10000);  // 10000

    // 상황2) policy 설정 (2000원 할인)
    // interface DiscountPolicy 구현객체 셍성
    // new 외부클래스.내부인터페이스() { 인터페이스 메소드 override }
    processor.setDiscountPolicy(new OrderProcessor.DiscountPolicy() {
      @Override
      public int applyDisCount(int price) {
        return price - 2000;
      }
    });
    processor.orderProcess(10000);  // 8000

    // 상황3) 50% 할인
    processor.setDiscountPolicy(new OrderProcessor.DiscountPolicy() {
      @Override
      public int applyDisCount(int price) {
        return price / 2;
      }
    });
    processor.orderProcess(10000);  // 5000

    // 주문 처리기(외부 클래스) 정의 시 흐름만 정의
    // 할인 계산방식(내부 인터페이스)는 외부에서 주입받기
    // 할인 정책 바뀌어도 OrderProcessor 코드 수정X
  }
}
