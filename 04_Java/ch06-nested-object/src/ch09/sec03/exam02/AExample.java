package ch09.sec03.exam02;

public class AExample {
  public static void main(String[] args) {
    // B 객체 생성
    A.B b = new A.B();

    // B class의 instance field
    System.out.println(b.field1);

    // instance method
    b.method1();

    // B class의 static field
    System.out.println(A.B.field2);

    // static method
    A.B.method2();
  }
}
