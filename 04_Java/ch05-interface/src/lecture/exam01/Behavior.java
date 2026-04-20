package lecture.exam01;

// 인터페이스 (Interface)
// 1. 기본적으로 추상메소드와 상수필드만 가질 수 있는 클래스의 변형체
//  => 필드 형식: public static final, 선언과 동시에 초기화 필수
//  => 메소드 형식: public abstract
// 2. 클래스에서 인터페이스 구현 시 implements 키워드 사용
public interface Behavior {

  // 일반 field 불가
  // private int num;

  // 상수 field 가능
  // public static final 생략 가능
  public static final int OPENING_TIME = 9;
  int CLOSING_TIME = 18;

  // 일반 method 불가
  // public void method() {}

  // 추상 method 가능
  // 구현부 없음 -> 구현 class에 override 필수
  // public abstract 생략가능
  public abstract void eat();
  void live();

  // 디폴트 method 가능
  // 구현부 있음 -> 구현 class에 override 필수X
  default void die() {
    System.out.println("우리는 언젠가 죽게 되어있습니다.");
  };

  // static method 가능
  // 공통 method 정의 (독립적)
  // 구현부 있음
  // 구현 class로 상속X -> 구현 class에 override 불가능
  static void born() {
    System.out.println("우리는 모두 엄마 뱃속에서 태어납니다.");
  }
}
