package ch09.sec07.exam03;

public class ButtonExample {
  public static void main(String[] args) {
    // OK Button 객체 생성
    Button btnOk = new Button();
    // OK Button 객체에 ClickListener 구현 객체 주입 (setter 함수 이용)
    btnOk.setClickListener(new Button.ClickListener() {
      @Override
      public void onClick() {
        System.out.println("Ok 버튼을 클릭했습니다.");
      }
    });
    // Ok button click
    btnOk.click();

    Button btnCancel = new Button();

    btnCancel.setClickListener(new Button.ClickListener() {
      @Override
      public void onClick() {
        System.out.println("Cancel 버튼을 클릭했습니다.");
      }
    });

    btnCancel.click();
  }
}
