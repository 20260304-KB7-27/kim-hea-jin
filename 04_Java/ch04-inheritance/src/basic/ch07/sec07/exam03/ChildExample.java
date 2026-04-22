package basic.ch07.sec07.exam03;

public class ChildExample {
    public static void main(String[] args) {
        // Child 객체 생성, Parent type으로 형변환
        Parent parent = new Child();

        // Parent class의 field, method에 접근가능
        parent.field1 = "data1";
        parent.method1();
        parent.method2();

        // 부모 클래스는 자식 클래스의 필드, 메소드에 접근불가
        // parent.field2 = "data2";
        // parent.method3();

        // 다시 Child type으로 형변환
        Child child = (Child) parent;

        // Child class의 field, method 접근가능
        child.field2 = "data2";
        child.method3();
    }
}
