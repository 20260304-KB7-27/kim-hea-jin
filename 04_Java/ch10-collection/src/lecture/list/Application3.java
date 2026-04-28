package lecture.list;

import java.util.Collections;
import java.util.Enumeration;
import java.util.List;
import java.util.Vector;

// [Vector]
public class Application3 {
  public static void main(String[] args) {

    // Vector
    // - ArrayList와 동일 구조이나 동기화(synchronized) 메소드로 구성됨
    // - 멀티스레드 환경에서 Thread-safe 동작 구현 (한 번에 하나의 스레드만 접근 가능)

    Vector<String> vector = new Vector<>();

    vector.add("a");
    vector.add("b");
    vector.add("c");
    vector.add("d");
    vector.add("e");

    System.out.println("vector = " + vector);
    System.out.println("vector.size() = " + vector.size());
    System.out.println("vector.get(0) = " + vector.get(0));

    // [참고] Enumeration (열거자)
    // - Iterator 이전의 방식 (Vector, HashTable 등 레거시 클래스에서 사용)

    Enumeration<String> enumeration = vector.elements();

    while (enumeration.hasMoreElements()) {
      System.out.println(enumeration.nextElement());
    }

    // ArrayList 동기화할 때 사용
    List<String> syncList = Collections.synchronizedList(new java.util.ArrayList<>());
  }
}
