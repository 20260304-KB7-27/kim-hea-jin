package ch15.sec04.exam01;

import java.util.*;
import java.util.Map.Entry;

public class HashMapExample {
  public static void main(String[] args) {

    // Map collection 생성
    Map<String, Integer> map = new HashMap();

    // 객체 저장
    map.put("신용권", 85);
    map.put("홍길동", 90);
    map.put("동장군", 80);
    map.put("홍길동", 95);

    // map에 저장된 객체 수 출력
    System.out.println("총 Entry 수: " + map.size());  // 3
    System.out.println();

    // 1. key로 value 얻기
    System.out.println("1. key로 value 얻기");

    String key = "홍길동";
    int value = map.get(key);

    System.out.println(key + ": " + value);
    System.out.println();

    // 2. key Set collection 얻고 반복문으로 key, value 얻기
    // Map은 Iterator 사용불가하므로 Set으로 변경
    System.out.println("2. key Set collection 얻고 반복문으로 key, value 얻기");

    Set<String> keySet = map.keySet();
    Iterator<String> keyIterator = keySet.iterator();

    while (keyIterator.hasNext()) {
      String k = keyIterator.next();
      Integer v = map.get(k);
      System.out.println(k + ": " + v);
    }
    System.out.println();

    // 3. Entry Set collection 얻고, 반복문으로 key, value 얻기
    System.out.println("3. Entry Set collection 얻고, 반복문으로 key, value 얻기");

    Set<Entry<String, Integer>> entrySet = map.entrySet();
    Iterator<Entry<String, Integer>> entryIterator = entrySet.iterator();

    while (entryIterator.hasNext()) {
      Entry<String, Integer> entry = entryIterator.next();
      String k = entry.getKey();
      Integer v = entry.getValue();
      System.out.println(k + ": " + v);
    }
    System.out.println();

    // key로 entry 삭제
    map.remove("홍길동");

    System.out.println("삭제 후 총 Entry 수: " + map.size());
    System.out.println();
  }
}
