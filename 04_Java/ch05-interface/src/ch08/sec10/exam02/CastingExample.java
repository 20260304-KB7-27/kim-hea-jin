package ch08.sec10.exam02;

public class CastingExample {
  public static void main(String[] args) {
    // Bus의 객체 생성 후 Vehicle type 변수에 대입
    // Bus 객체를 Vehicle type으로 형변환(upcasting)
    Vehicle vehicle = new Bus();

    // Bus class의 오버라이드 메소드 호출
    vehicle.run();
    // Vehicle type이므로 Vehicle class의 멤버만 접근가능
    // vehicle.checkFare();

    // Vehicle type을 Bus type으로 형변환(downcasting)
    Bus bus = (Bus) vehicle;
    // 실제 객체(Bus)의 오버라이드 메소드 호출
    bus.run();
    // Bus class의 메소드 호출 가능
    bus.checkFare();
  }
}
