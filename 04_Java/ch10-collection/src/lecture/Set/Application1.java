package lecture.Set;

import java.util.HashSet;
import java.util.Set;

// [HashSet]
public class Application1 {
  public static void main(String[] args) {

    // HashSet
    // - Set 인터페이스 대표 구현 클래스
    // - 해시 기반 동작 -> 검색 속도 빠름
    // - 순서 X
    // - 중복 X

    Set<String> hset = new HashSet<>();

    hset.add("java");
    hset.add("mysql");
    hset.add("jdbc");
    hset.add("vue");
    hset.add("js");

    // 순서 X
    System.out.println("hset = " + hset);  // [java, vue, js, mysql, jdbc] 순서X

    // 중복 저장 불가
    boolean added = hset.add("js");
    System.out.println("added = " + added);  // false (중복X)
    System.out.println("hset = " + hset);

    // set 반복 출력
    for (String str : hset) {
      System.out.println("str = " + str);
    }
  }
}
