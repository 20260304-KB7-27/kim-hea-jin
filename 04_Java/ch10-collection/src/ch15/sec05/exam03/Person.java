package ch15.sec05.exam03;

public class Person implements Comparable<Person>{
  // field
  public String name;
  public int age;

  // contructor
  public Person(String name, int age) {
    this.name = name;
    this.age = age;
  }

  // 정렬기준
  @Override
  public int compareTo(Person o) {
    // age 기준 정렬
    if (age < o.age) return -1;
    else if (age == o.age) return 0;
    else return 1;
  }
}
