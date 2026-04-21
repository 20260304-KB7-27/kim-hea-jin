package lecture.exam02;

/*
  시나리오: 게시판 API 응답 데이터 담기 위한 클래스
  게시글 정보 + 작성자 정보
*/
public class PostResponse {
  // 게시글 정보
   private String title;
   private String content;

  // 작성자 정보
  // private String name;
  // private String email;

  // 1) 게시글/작성자 정보 구분 어려움 -> 논리적 그룹화 필요 (Grouping)
  //   => Author(작성자) class 따로 생성
  // 2) 프론트엔드 통신 -> json 계층적 구조화
  // 3) Author class 네부 클래스로 정의

  // 작성자 정보 담기위한 내부 클래스 (기능X)
  // 외부 클래스 멤버 사용X (외부에 의존X 독립적인 데이터 묶음) -> static
  // 정적 내부 클래스
  static class Author {
    // field
    private String name;
     private String email;

     // constructor
    public Author(String name, String email){
      this.name = name;
      this.email = email;
    }
  }
}
