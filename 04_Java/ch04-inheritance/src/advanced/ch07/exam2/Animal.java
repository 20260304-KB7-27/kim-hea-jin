package advanced.ch07.exam2;

public abstract class Animal {
  // 일반 method
  public void breathe() {
    System.out.println("숨을 쉽니다.");
  }

  // 추상 method
  public abstract void sound();
}
