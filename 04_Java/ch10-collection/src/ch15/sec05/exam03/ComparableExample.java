package ch15.sec05.exam03;

import java.util.TreeSet;

public class ComparableExample {
  public static void main(String[] args) {

    // TreeSet collection 생성
    TreeSet<Person> treeSet = new TreeSet<>();

    // 객체 저장
    treeSet.add(new Person("홍길동", 35));
    treeSet.add(new Person("감자바", 25));
    treeSet.add(new Person("박지원", 31));

    // 객체 하나씩 가져와 출력
    for (Person person : treeSet) {
      System.out.println(person.name + ":" + person.age);
    }
  }
}
