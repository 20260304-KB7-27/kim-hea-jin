package lecture.Set;

import java.util.TreeSet;

public class Application2 {
  public static void main(String[] args) {

    // TreeSet
    // - 이진 탐색 트리 가반의 set 구현 클래스
    // - 요소 자동 오름차순 정렬 (작은 것 왼쪽, 큰 것 오른쪽)
    // - 중복 X
    // - 탐색 / 자동 정렬 시 사용

    TreeSet<Integer> tset = new TreeSet<>();

    tset.add(30);
    tset.add(10);
    tset.add(50);
    tset.add(20);
    tset.add(40);
    tset.add(10);
    System.out.println("tset = " + tset);  // [10, 20, 30, 40, 50]

    System.out.println("tset.first() = " + tset.first());  // 가장 작은 요소 10 출력
    System.out.println("tset.last() = " + tset.last());  // 가장 큰 요소 50 출력

    // ceiling(e): e 이상인 요소 중 가장 작은 값
    // higher(e): e 초과인 요소 중 가장 작은 값 
    System.out.println("tset.floor(25) = " + tset.floor(25));  // 25 이하 요소 중 가장 큰 값 20 출력
    System.out.println("tset.lower(20) = " + tset.lower(20));  // 20 미만 요소 중 가장 큰 값 10 출력
    
    // headSet(e): e 미만 요소들로 구성된 set 반환 
    // tailSet(e): e 이상인 요소들로 구성된 set 반환
    // subSet(from, to): from 이상 to 미만인 요소들로 구성된 set 반환

    System.out.println("tset.headSet(30) = " + tset.headSet(30));  // [10, 20]
    System.out.println("tset.tailSet(30) = " + tset.tailSet(30));  // [30, 40, 50]
    System.out.println("tset.subSet(20, 40) = " + tset.subSet(20, 40));  // [20, 30]
  }
}
