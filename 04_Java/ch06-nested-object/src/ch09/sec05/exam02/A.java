package ch09.sec05.exam02;

public class A {
  // A class field
  String field = "A-field";
  // A class method
  void method(){
    System.out.println("A-method");
  }

  // instance member class
  class B {
    // B class field
    String field = "B-field";
    // B class method
    void method() {
      System.out.println("B-method");
    }
    void print() {
      // B class field, method 사용
      System.out.println(this.field);
      this.method();

      // A class field, method 사용
      System.out.println(A.this.field);
      A.this.method();
    }
  }

  // A class method
  void useB() {
    B b = new B();
    b.print();
  }
}
