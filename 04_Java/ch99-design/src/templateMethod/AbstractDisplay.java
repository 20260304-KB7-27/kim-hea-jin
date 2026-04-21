package templateMethod;

public abstract class AbstractDisplay {
  // abstract method
  public abstract void open();
  public abstract void print();
  public abstract void close();

  // AbstractDisplay에서 구현하는 method
  // override 금지
  public final void display() {
    open();
    for (int i = 0; i < 5; i++){
      print();
    }
    close();
  }
}
