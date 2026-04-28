package lecture.compare;

import java.util.Comparator;

public class StudentComparatorByName implements Comparator<Student> {

  // compare() 메소드 재정의
  @Override
  public int compare(Student o1, Student o2) {

    // String compareTo(): 사전순 비교
    return o1.getName().compareTo(o2.getName());
  }
}
