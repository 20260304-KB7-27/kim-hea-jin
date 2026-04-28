package lecture.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// [Collection Framwork 종류], [Iterator (반복자)]
public class Application1 {
  public static void main(String[] args) {

    // [Collection Framwork 종류]
    // 1. Collection 계열 (값만 저장)
    //  - List interface
    //    - 순서 있음, 중복 가능
    //    - ArrayList, LinkedList, Stack, Vector
    //  - Set interface
    //    - 순서 없음, 중복 불가
    //    - HashSet, TreeSet
    //  - Queue interface
    //    - FIFO(선입선출) 구조
    //    - 순서 있음, 중복 가능 (데이터의 삽입, 삭제 한 방향)
    //    - PriorityQueue, ArrayQueue, LinkedList
    //
    // 2. Map 계열 (Key, Value 저징)
    //  - 키와 값이 한 쌍으로 이루어진 데이터 집합
    //  - 키 중복 불가, 키 중복 가능
    //  - HashMap. TreeMap, Properties

    // List 생성 및 추가
    List<String> stringList = new ArrayList<>();
    stringList.add("list");
    stringList.add("set");
    stringList.add("queue");

    // List.of으로 List 생성 및 초기화 -> List 변경 불가
//    List<String> stringList2 = new ArrayList<>(List.of("list", "set", "queue"));
//    stringList2.add("test");


    // [Iterator (반복자)]
    // - collection(list, set, queue, map)에 저장된 요소를 순차적으로 읽어오기 위한 방법

    // Iterator 객체 생성
    Iterator<String> iterator = stringList.iterator();

    // hasNext(): 다음 요소가 남아있으면 true, 없으면 false
    // next(): 커서를 다음 요소로 이동, 해당 요소 반환

//    while (iterator.hasNext()) {
//      String str = iterator.next();
//      System.out.println(str);
//    }

    // 향상된 for문도 내부적으로 Iterator 사용
    // 주의: List 직접 삭제 시 예외 발생 가능
//    for (String str : stringList) {
//      if(str.length() < 5) {
          // ConcurrentModificationException 발생
//        stringList.remove(str);
//      }
//      System.out.println(str);
//    }

    // 컬렉션의 수정 횟수 기록됨
    // modCount: 컬렉션 변경될 때마다 값 증가
    // expectedModcount: Iteractor 생성 시 modCount 값 리턴 -> 불일치 시 예외 발생

    while (iterator.hasNext()) {
      String str = iterator.next();
      if(str.length() < 5) {
        // stringList가 아닌 커서(iterator) 기준 삭제
        iterator.remove();
      }
      System.out.println("결과: " + stringList);
    }
  }
}
