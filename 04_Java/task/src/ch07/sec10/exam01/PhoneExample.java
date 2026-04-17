package ch07.sec10.exam01;

public class PhoneExample {
    public static void main(String[] args) {

        // 추상 클래스는 객체 생성 불가
        // Phone phone = new Phone();

        // 자식 객체 생성 후 부모로 형변환 (upcasting)
        // 부모 클래스의 필드, 메소드만 접근가능
        Phone phone = new SmartPhone("아무개");

        SmartPhone smartPhone = new SmartPhone("홍길동");

        smartPhone.turnOn();
        smartPhone.internetSearch();
        smartPhone.turnOff();
    }
}
