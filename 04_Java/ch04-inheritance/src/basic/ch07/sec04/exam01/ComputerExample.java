package basic.ch07.sec04.exam01;

public class ComputerExample {
    public static void main(String[] args) {
        // 객체 생성
        Calculator cal = new Calculator();
        Computer com = new Computer();

        // areaCircle() 호출
        double calResult = cal.areaCircle(4);
        double comResult = com.areaCircle(4);

        // 결과값 출력
        System.out.println("Calulator: " + calResult);
        System.out.println("Computer: " + comResult);

    }
}
