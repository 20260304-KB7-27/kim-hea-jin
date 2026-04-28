package ch15.sec03.exam03;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetExample {
  public static void main(String[] args) {

    // HashSet collection 생성
    Set<String> set = new HashSet<>();

    // 객체 추가
    set.add("Java");
    set.add("JDBC");
    set.add("JSP");
    set.add("Spring");

    // Iterator로 각 요소 출력
    Iterator<String> iterator = set.iterator();
    while (iterator.hasNext()) {
      String str = iterator.next();
      System.out.println(str);
    }
    System.out.println();

    // 향상된 for문으로 각 요소 출력
    for (String str : set) {
      System.out.println(str);
    }
  }
}
