package ch09.sec02.exam02;

public class A {

  // instance member class
  class B{
    // instance field
    int field1 = 1;
    // static field (Java17~)
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
    static void method2(){
      System.out.println("B-method2 실행");
    }
  }

  // A class의 instance method
  void useB() {
    // B 객체 생성 및 B class의 instance field, method 사용
    B b = new B();
    // b: B type의 B 객체이므로 B class의 member 접근 가능
    System.out.println(b.field1);
    b.method1();

    // B class의 static field, method 사용
    // static member는 객체 생성 없이 접근가능
    System.out.println(B.field2);
    B.method2();
  }

}
