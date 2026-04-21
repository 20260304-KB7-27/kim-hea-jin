package ch09.sec06.exam03;

public class ButtonExample {
  public static void main(String[] args) {
    // Button 객체 생성
    Button btnOk = new Button();

    // 익명 클래스 사용해 구현 객체 생성
    btnOk.setClickListener(new Button.ClickListener(){
      @Override
      public void onClick() {
        System.out.println("OK 버튼을 클릭했습니다.");
      }
    });

    btnOk.click();
  }
}
