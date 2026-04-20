package advanced.ch07.exam;

public class HttpServletExample {
  public static void main(String[] args) {
    // HttpServlet httpservlet; // = new HttpServlet();
    //            o                        x

    // 자식 객체 생성
    method(new LoginServlet());
    method(new FileDownloadServlet());
  }

  // 자식 객체 부모 클래스로 자동 형변환 (upcasting)
  public static void method(HttpServlet httpServlet){
    // 자식 객체의 override method 호출 (실제 객체참조)
    httpServlet.service();
  }
}
