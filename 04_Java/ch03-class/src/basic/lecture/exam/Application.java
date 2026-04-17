package basic.lecture.exam;

public class Application {
    public static void main(String[] args) {
        Database database1 = Database.getInstance();
        Database database2 = Database.getInstance();

        // singleton 패턴 특징
        // 1. 생성자를 private로 설정해 외부에서 객체 생성 제한
        // 2. 클래스 내부에서 자기 자신의 인스턴스 한 개 생성
        // 3. public method 통해서만 접근 가능
        System.out.println("database2 = " + database2);
        System.out.println("database1 = " + database1);
    }
}
