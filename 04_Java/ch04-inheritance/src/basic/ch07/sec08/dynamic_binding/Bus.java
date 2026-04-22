package basic.ch07.sec08.dynamic_binding;

public class Bus extends Vehicle{

    @Override
    public void run() {
        System.out.println("버스가 달립니다.");
    }
}
