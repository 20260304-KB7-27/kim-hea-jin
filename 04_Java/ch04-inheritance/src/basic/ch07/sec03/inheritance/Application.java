package basic.ch07.sec03.inheritance;

public class Application {
    public static void main(String[] args) {

        // 자식의 기본생성자 호출
        // 출력: 부모 생성자 호출 후 자식 생성자 호출
        SmartPhone smartPhone = new SmartPhone();

        // 자식의 (매개변수 있는)생성자 호출
        SmartPhone smartPhone1 = new SmartPhone("galaxy", "silver", "56");

        // 부모의 메소드 호출
        // 상속받은 메소드
        // 자식에서 오버라이딩한 함수 호출
        smartPhone1.printModel();

        // type이 부모(phone)로 형변환되어 자식(smartphone)의 field 상속 불가
        Phone phone3 = new SmartPhone();

        // downcasting: 형변환 부모(phone) -> 자식(smartphone)
        SmartPhone phone4 = (SmartPhone) phone3;
        // network 접근가능
        System.out.println(phone4.network);
    }
}
