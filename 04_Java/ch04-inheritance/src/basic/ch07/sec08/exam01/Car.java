package basic.ch07.sec08.exam01;

public class Car {
    // Tire 객체 선언
    public Tire tire;

    // run method 호출 시 Tire class의 roll method 호출
    public void run() {
        tire.roll();
    }
}
