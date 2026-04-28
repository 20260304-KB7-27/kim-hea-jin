package lecture.compare;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

@Getter
@AllArgsConstructor
@ToString
public class Student implements Comparable<Student> {
  // Student 정렬 기준을 Comparable 인터페이스로 구현
  private int id;
  private String name;
  private String email;
  private String githubUrl;
  private String team;

  // Comparable 구현
  // - id 오름차순
  //
  // compareTo() 반환값 규칙 지정 필요
  // - 음수: this가 o보다 앞에 위치
  // - 0: 순서 변경 없음
  // - 양수: this가 o보다 뒤에 위치
  //
  // 매개변수(o): this와 비교 대상
  @Override
  public int compareTo(Student o) {
    // id로 정렬
    if (this.id < o.id) {
      return -1;
    } else if (this.id == o.id) {
      return 0;
    } else {
      return 1;
    }
  }

}
