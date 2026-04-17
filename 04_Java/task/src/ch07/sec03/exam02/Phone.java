package ch07.sec03.exam02;

public class Phone {
    // field
    public String model;
    public String color;

    // constructor
    public Phone(String model, String color) {
        this.model = model;
        this.color = color;
        System.out.println("Phone 생성자 실행");
    }
}
