package lecture.exam04;

/*
  시나리오: 주문처리(외부 클래스)와 할인정책(내부 인터페이스)
  할인정책은 주문처리와 일접한 연관이 있고, 주문처리에만 쓰이므로 내부에 정의해 응집도 높임
*/
public class OrderProcessor {

  // 할인정책 interface
  public interface DiscountPolicy {
    // 기존 금액 전달 받아서 할인 적용 후 할인 금액 반환
    int applyDisCount(int price);
  }

  // 할인정책 구현객체를 기록할 field 정의
  private DiscountPolicy policy;  // 초기값: null

  // 할인정책 설정 method (private policy에 접근위한 setter 함수)
  public void setDiscountPolicy(DiscountPolicy policy){
    this.policy = policy;
  }

  // 주문처리 method
  // 금액 전달받은 후 applyDiscount 적용
  public void orderProcess(int price) {

    // 최종 주문 금액
    int finalPrice = price;

    // 할인 정핵 설정되어있을 경우
    if (policy != null) {
      finalPrice = policy.applyDisCount(price);
    }

    System.out.println("최종 주문 금액: " + finalPrice);
  }
}
