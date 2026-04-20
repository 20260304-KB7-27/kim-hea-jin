package lecture.exam01;

public class Worker extends Person implements Behavior{  // name, age
  // 추가 field
  String companyName;
  String position;

  @Override
  public void eat() {
    System.out.println("구내식당에서 점심을 먹습니다.");
  }

  @Override
  public void live() {
    System.out.println(Behavior.OPENING_TIME + "시부터 " + Behavior.CLOSING_TIME + "시까지 근무합니다.");
  }

  // default method override
  @Override
  public void die() {
    System.out.println("일을 제대로 안 하면 대표님이 죽여용 >.0");
  }
}
