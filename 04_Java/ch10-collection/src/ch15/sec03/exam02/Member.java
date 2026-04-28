package ch15.sec03.exam02;

// HashSet class -> 중복 체크하기 위해 hashCode(), equals() override
public class Member {

  // field
  public String name;
  public int age;

  // constructor
  public Member(String name, int age) {
    this.name = name;
    this.age = age;
  }

  @Override
  public int hashCode() {
    return name.hashCode() + age;
  }

  @Override
  public boolean equals(Object obj) {
    if (obj instanceof Member target) {
      return target.name.equals(name) && (target.age == age);
    } else {
      return false;
    }
  }
}
