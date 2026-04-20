package ch08.sec04;

public class RemoteControlExample {
  public static void main(String[] args) {
    // 타입 선언 (RemoteControl 인터페이스 구현한 객체만 참조가능함을 의미)
    // 갹채를 가리키는 타입(참조 변수)
    RemoteControl rc;

    // television 객체 생성 후 rc에 대입
    rc = new Television();
    // television class의 오버라이딩 메소드 호출
    rc.turnOn();
    rc.setVolume(5);
    rc.turnOff();

    rc = new Audio();
    rc.turnOn();
    rc.setVolume(5);
    rc.turnOff();
  }
}
