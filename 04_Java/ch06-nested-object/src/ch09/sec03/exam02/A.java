package ch09.sec03.exam02;

public class A {
  // static member class
  static class B {
    // instance field
    int field1 = 1;
    static int field2 = 2;

    // constructor
    B() {
      System.out.println("B-생성자 실행");
    }

    // instance method
    void method1() {
      System.out.println("B-method1 실행");
    }
    // static method (Java17~)
    static void method2() {
      System.out.println("B-method2 실행");
    }
  }
}
