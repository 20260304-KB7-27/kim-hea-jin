package lecture.exam02;

public class PostExample {
  public static void main(String[] args) {
    // 정적 내부 객체는 외부 객체 생성 필요X
    // type: 외부클래스.내부클래스
    // 생성자: new 외부클래스.내부클래스();
    PostResponse.Author author = new PostResponse.Author("JAVA", "java@java.com");
  }
  // 빌더패턴
}
