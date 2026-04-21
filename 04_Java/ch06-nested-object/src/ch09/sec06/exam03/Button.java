package ch09.sec06.exam03;

public class Button {
  // 정적 멤버 인스턴스
  public static interface ClickListener {
    void onClick();
  }

  // field
  private ClickListener clickListener;

  // method
  // private field 접근위한 setter 함수
  public void setClickListener(ClickListener clickListener) {
    this.clickListener = clickListener;
  }

  public void click() {
    this.clickListener.onClick();
  }
}
