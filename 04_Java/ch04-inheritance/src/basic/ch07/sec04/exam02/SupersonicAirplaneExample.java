package basic.ch07.sec04.exam02;

public class SupersonicAirplaneExample {
    public static void main(String[] args) {
        SupersonicAirplane sa = new SupersonicAirplane();
        sa.takeOff();  // 이륙합니다. (부모 메소드 호출)
        sa.fly();  // 일반 비행합니다. (부모 메소드 호출)
        sa.flyMode = SupersonicAirplane.SUPERSONIC;
        sa.fly();  // 초음속 비행합니다. (자식 오버라이드 메소드 호출)
        sa.flyMode = SupersonicAirplane.NORMAL;
        sa.fly();  // 일반 비행합니다. (부모 메소드 호출)
        sa.land();  // 착륙합니다. (부모 메소드 호출)
    }
}
