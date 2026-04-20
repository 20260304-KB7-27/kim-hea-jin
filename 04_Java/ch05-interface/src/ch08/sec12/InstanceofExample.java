package ch08.sec12;

public class InstanceofExample {

  // ride method 정의
  public static void ride (Vehicle vehicle) {
    // 타입 검사와 동시에 변환 (Vehicle -> Taxi : downcasting)
    if (vehicle instanceof Taxi taxi) {
      // 형변환 되었으므로 Taxi의 method 호출가능
      // 실제 Taxi 객체이므로 override method 호출
      taxi.run();
    } else if (vehicle instanceof Bus bus) {
      bus.checkFare();
      bus.run();
    }
  }

  public static void main(String[] args) {
    Taxi taxi = new Taxi();
    Bus bus = new Bus();

    ride(taxi);
    ride(bus);
  }

}
