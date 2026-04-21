package templateMethod;

public class CharDisplay extends AbstractDisplay{
  // 표시할 문자
  private char ch;

  public CharDisplay(char ch){
    this.ch = ch;
  }

  @Override
  public void open() {
    System.out.print("<<");
  }

  @Override
  public void print() {
    System.out.print(ch);
  }

  @Override
  public void close() {
    System.out.println(">>");
  }
}
