package lecture.exam01;

public class Student extends Person implements Behavior{  // name, age 사용가능
  // 추가 field
  String schoolName;
  int grade;

  // 실제 동작 결정
  @Override
  public void eat() {
    System.out.println("학교에서 급식을 먹습니다.");
  }

  @Override
  public void live() {
    // 인터페이스의 상수필드 사용가능
    // Behavior 생략가능
    // -> 생략 시 this: 현재 객체 (없으면 부모 객체)
    // -> Student class에 없고 Behavior class에 있으므로 this: Behavior
    System.out.println(Behavior.OPENING_TIME + "시부터 " + Behavior.CLOSING_TIME + "시까지 학교에서 수업을 듣습니다.");
  }
}
