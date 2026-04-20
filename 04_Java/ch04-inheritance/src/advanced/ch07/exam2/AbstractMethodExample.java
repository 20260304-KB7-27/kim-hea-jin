package advanced.ch07.exam2;

public class AbstractMethodExample {
  public static void main(String[] args) {
    // 자식 객체 생성
    Dog dog = new Dog();
    // 자식 객체의 sound method 호출
    dog.sound();

    Cat cat = new Cat();
    cat.sound();

    animalSound(new Dog());
    animalSound(new Cat());
  }

  // 자식 객체를 매개변수로 받아 부모 클래스로 형변환
  private static void animalSound(Animal animal) {  // 매개변수의 다형성
    // 실제 객체(자식 객체)의 오버라이드 메소드 호출
    animal.sound();  // 동적 바인딩
  }
}
