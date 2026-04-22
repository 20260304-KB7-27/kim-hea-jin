package basic.ch07.sec07.exam02;

public class ChildExample {
    public static void main(String[] args) {
        // Child 객체 생성
        Child child = new Child();
        // 생성된 child instance Parent type으로 형변환(혹은 제한)
        Parent parent = child;

        parent.method1();  // 부모 method 호출가능
        parent.method2();  // child 객체에 오버라이드된 method 호출 (실제 객체 기준)
        // parent.method3();  // 자식의 method 호출불가
    }
}
