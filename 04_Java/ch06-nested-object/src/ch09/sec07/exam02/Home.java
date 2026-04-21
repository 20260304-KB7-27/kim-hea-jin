package ch09.sec07.exam02;

public class Home {

  // 익명 구현 객체 rc에 대입
  RemoteControl rc = new RemoteControl() {
    @Override
    public void turnOn() {
      System.out.println("TV를 켭니다.");
    }

    @Override
    public void turnOff() {
      System.out.println("TV를 끕니다.");
    }
  };

  // method
  public void use1() {
    rc.turnOn();
    rc.turnOff();
  }
}
