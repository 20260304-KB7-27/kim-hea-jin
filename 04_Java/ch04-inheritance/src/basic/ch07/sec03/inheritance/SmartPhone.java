package basic.ch07.sec03.inheritance;

// 상속
// - 뷰모가 가진 멤버(field, method)를 자식이 물려받음을 의미
// - 자바에서는 확장의 개념으로 생각
public class SmartPhone extends Phone{
    // field
    public String network;

    // constructor
    public SmartPhone() {
        // 부모 기본 생성자 super(); 생략가능
        System.out.println("자식의 기본생성자 호출");
    }

    public SmartPhone(String model, String color, String network) {
        // 부모 constructor 호출 (부모 생성자 존재시 필요)
        // 위치: 자식보다 위
        super(model, color);
        this.network = network;
        System.out.println("자식의 모든 필드를 초기화하는 생성자 호출");
    }

    // Overriding (메소드 재정의)
    // - 부모가 가지는 메소드 선언부를 그대로 사용하면서
    // - 자식클래스에서 정의한대로 동작하도록 함
    // - @Override: 컴파일 시 제대로 오버라이딩 되었는지 체크
    // 참고
    // - private/final method는 override 불가
    // - override 메서드의 접근제어자 >= 부모 메서드의 접근제어자

    // override 단축키: ctrl + o
    @Override
    public void printModel() {

        // super.printModel();  // super: 부모객체 가리킴

        System.out.println("자식에서 override한 printModel() 호출");
    }
}
