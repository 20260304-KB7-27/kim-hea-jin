package lecture.exam03;

public class AnimalExample {
  public static void main(String[] args) {

    // dog sound 필요
    // 방법1. Animal 상속받는 Dog class 만들어서 sound() override
    // 벙법2. 한 번만 필요한 경우 Example class에서 생성 (익명 클래스)

    Animal dog = new Animal() {
      @Override
      public void sound() {
        System.out.println("멍멍");
      }
    };
    dog.sound();  // 멍멍

    Animal cat = new Animal() {
      @Override
      public void sound() {
        System.out.println("야옹");
      }
    };
    cat.sound();

    // interface도 동일한 방식
    // 단, 추상 메소드 한 개 -> 익명 클래스 방식보다 lambda 방식 선호
  }
}
