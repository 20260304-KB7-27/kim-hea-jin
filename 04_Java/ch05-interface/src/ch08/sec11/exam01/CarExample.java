package ch08.sec11.exam01;

public class CarExample {
  public static void main(String[] args) {

    // Car 객체 생성
    // HankookTire로 초기화됨
    Car myCar = new Car();
    myCar.run();

    // Car의 field tire1, tire2에 새 객체 대입
    myCar.tire1 = new KumhoTire();
    myCar.tire2 = new KumhoTire();
    // 대입된 금호타이어 객체의 오버라이드 메소드 호출
    myCar.run();
  }
}
