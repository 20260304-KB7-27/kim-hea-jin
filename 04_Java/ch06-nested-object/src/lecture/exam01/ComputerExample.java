package lecture.exam01;

public class ComputerExample {
  public static void main(String[] args) {

    // 인스턴스 내부 객체 생성 시
    // 외부 객체 먼저 생성 필요
    Computer myPc = new Computer();

    // 인스턴스 내부 객체 생성
    // type: 외부클래스.내부클래스
    // 외부 객체 참조해 내부 객체 생성
    Computer.CPU myCpu = myPc.new CPU();

    // CPU class의 method 호출
    myCpu.process(); // off -> 연신 블가

    // Computer class의 method 호출
    myPc.powerOn(); // 전원키기
    myCpu.process(); // on -> 연산 가능

    // 문제점: 외부 객체를 없애도 내부 객체가 살아있는 경우 메모리 점유 유지
    // 내부객체 생성 시 숨은참조(외부객체) 생성 -> '숨은 참조에 의한 메모리 누수' 발생
    myPc = null;
    myCpu.process();  // 연산을 시작합니다.
  }
}
