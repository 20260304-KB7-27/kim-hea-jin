package lecture.exam01;

public class PersonExample {
  public static void main(String[] args) {

    // 인터페이스: 객체 생성 불가
    // 인터페이스: 참조 타입으로 사옹 가능 (Behavior type으로 정의)
    Behavior behaviorPerson; // = new Behavior();

    // 자식 클래스에서 부모 클래스로 자동 형변환 가능 (upcasting)
    behaviorPerson = new Student();

    behaviorPerson.eat();
    behaviorPerson.live();
    behaviorPerson.die();  // default
    Behavior.born();  // static
    System.out.println();

    behaviorPerson = new Worker();

    behaviorPerson.eat();
    behaviorPerson.live();
    behaviorPerson.die();  // override
    Behavior.born();

  }
}
