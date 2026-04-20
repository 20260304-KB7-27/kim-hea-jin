package ch08.sec09;

public class ExtendsExample {
  public static void main(String[] args) {
    // 구현 클래스 객체 생성
    InterfaceCImpl impl = new InterfaceCImpl();

    // InterfaceA type 변수에 구현클래스 객체 대입
    // 구현클래스 객체 InterfaceA type으로 형변환
    InterfaceA ia = impl;
    // InterfaceA type이므로 InterfaceA의 멤버만 접근가능
    // 실제객체는 InterfaceCImpl이므로 오버라이드 메소드 호출
    ia.methodA();
    System.out.println();

    InterfaceB ib = impl;
    ib.methodB();
    System.out.println();

    // InterfaceA, B를 상속하는 InterfaceC type의 변수에 구현클래스 객체 대입
    InterfaceC ic = impl;
    // InterfaceCImpl 객체의 오버라이드 메소드 호출
    ic.methodA();
    ic.methodB();
    ic.methodC();
  }
}
