package ch08.sec11.exam02;

import java.util.Scanner;

public class DriverExample {
  public static void main(String[] args) {
    // driver 객체 생성
    Driver driver = new Driver();

    // 구현 객체 생성
    Bus bus = new Bus();
    Taxi taxi = new Taxi();

    // 매개변수 값으로 구현 객체 대입
    driver.drive(bus);  // 자동 형변환: Bus -> Vehicle
    driver.drive(taxi);  // 자동 형변환: Taxi -> Vehicle


    // 추가문제(강의)
    Scanner scanner = new Scanner(System.in);

    System.out.println("운전할 차를 선택하세요: 1) Taxi, 2) Bus, 3) Truck");

    int num = scanner.nextInt();

    // 절차중심
//        if (car == 1) {
//            driver.drive(taxi);
//        } else if (car == 2) {
//            driver.drive(bus);
//        } else {
//            System.out.println("잘못된 입력값입니다.");
//        }

    // 객체중심
    // 인터페이스 타입의 구현객체 생성
    Vehicle cars[] = {
            new Taxi(),
            new Bus(),
            new Truck()
    };

    // 구현객체의 오버라이드 메소드 호출
    cars[num-1].run();

    scanner.close();

  }
}
