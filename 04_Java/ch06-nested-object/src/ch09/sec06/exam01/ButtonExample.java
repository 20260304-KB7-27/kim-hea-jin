package ch09.sec06.exam01;

public class ButtonExample {
  public static void main(String[] args) {

    // 로컬(구현) 클래스 정의
    class OkListener implements Button.ClickListener {
      @Override
      public void onClick() {
        System.out.println("버튼 클릭");
      }
    }

    // 로컬 클래스 객체 생성
    OkListener listener = new OkListener();

    // method 호출
    listener.onClick();
  }
}
