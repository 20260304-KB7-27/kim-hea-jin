package basic.ch07.sec03.inheritance;

public class Phone {
    // field
    public String model;
    public String color;

    // constructor
    // 기본생성자 생성X
    public Phone(String model, String color) {
        this.model = model;
        this.color = color;
        System.out.println("부모의 모든 필드를 초기화하는 생성자 호출");
    }

    public Phone() {
        System.out.println("부모 기본 생성자 호출");
    }

    // method
    public void printModel() {
        System.out.println("부모 Phone에서 호출됨 model = " + model);
    }


    @Override
    public String toString() {
        return "Phone{" +
                "model='" + model + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}
