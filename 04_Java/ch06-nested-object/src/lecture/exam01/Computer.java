package lecture.exam01;
/*
* 시나리오: 내 컴퓨터의 CPU
* 컴퓨터의 전원유무에 따른 CPU의 연산 동작 (전원이 켜졌을 경우 CPU 연산 가능)
* 컴퓨터 객체의 상태(전원 유무)에 따라 CPU의 '연산' 동작이 종속되는 상황
*/
public class Computer {
  // field (전원 유무)
  private boolean isPowerOn = false;

  // method (전원 키는 동작)
  public void powerOn() {
    this.isPowerOn = true;
  }

  // 인스턴스 내부(멤버) 클래스
  // 외부 클래스의 멤버에 접근 가능 (접근 제어자 상관X)
  class CPU {
    void process() {
      // 컴퓨터의 전원 유무 (외부 클래스 Computer의 field)에 따라 다른 동작 수행
      if (isPowerOn) {
        System.out.println("연산을 시작합니다.");
      } else {
        System.out.println("전원이 꺼져있어 연산을 할 수 없습니다.");
      }
    }
  }
  // CPU class를 분리했을 경우
  // : 외부에서 컴퓨터 객체의 isPowerOn field에 접근가능하도록 getter method 추가 필요
  // => CPU class가 Computer class에서만 사용될 경우 내부 클래스로 정의해 응집도 높임
}


