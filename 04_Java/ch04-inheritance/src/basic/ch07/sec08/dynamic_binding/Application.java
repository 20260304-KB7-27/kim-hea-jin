package basic.ch07.sec08.dynamic_binding;

public class Application {
    public static void main(String[] args) {

        Driver1 driver = new Driver1();
        Vehicle vehicle = new Vehicle();
        Bus bus = new Bus();

        // Driver1 class의 drive method호출
        // Bus(자식) 객체 전달받아 Vehicle(부모) type으로 형변환
        // Bus객체에서 오버라이딩한 run method 호출

        // 동적 바인딩
        // 매개변수 타입은 Vehicle이지만
        // 실제 전달되는 객체에 따라 실행 메소드 달라짐
        driver.drive(bus);

        // 개방 폐쇄법칙
        // 확장에는 열려있고, 수정에는 닫혀있는 구조
    }
}
