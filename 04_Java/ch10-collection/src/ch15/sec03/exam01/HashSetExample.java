package basic.ch15.sec03.exam01;

import java.util.HashSet;
import java.util.Set;

public class HashSetExample {
  public static void main(String[] args) {

    Set<String> set = new HashSet<String>();

    set.add("Java");
    set.add("JDBC");
    set.add("Servelt/JSP");
    set.add("Java");
    set.add("iBATIS");

    int size = set.size();
    System.out.println("총 객체 수: " + size);

    // 실행결과
    // 총 객체 수: 4
  }
}
