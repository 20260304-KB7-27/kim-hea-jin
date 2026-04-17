package basic.ch07.sec08.exam02;

public class Driver1 {

    // method -> 의존관계
    // Vehicle class의 객체 생성 -> run 호출
    // Vehicle class를 상속받는 class도 run 호출/오버라이딩 가능
    // 수정하지 않고도 여러 결과 출력가능
    public void drive(Vehicle vehicle) {
        vehicle.run();
    }
}
