package basic.ch07.sec03.exam02;

public class SmartPhone extends Phone{

    // constructor
    public SmartPhone(String model, String color) {
        // 부모 생성자 먼저 호출
        super(model, color);

        System.out.println("SmartPhone 생성자 실행");
    }
}
