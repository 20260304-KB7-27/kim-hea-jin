package lecture.compare;

import java.util.*;

public class Application {
  public static void main(String[] args) {

    Set<Student> students = new TreeSet<>();
    students.add(new Student(1, "김주영", "myjuyoung2@gmail.com", "https://github.com/1juyoung", "6팀"));
    students.add(new Student(2, "최윤호", "choiyh2001@gmail.com", "https://github.com/youknowwgit", "5팀"));
    students.add(new Student(3, "권원영", "onyo9ssafy@gmail.com", "https://github.com/iamadreamer10", "5팀"));
    students.add(new Student(4, "김호성", "khskhs726@gmail.com", "https://github.com/HoSeong0731", "2팀"));
    students.add(new Student(5, "김나현", "nhkim7788@gmail.com", "https://github.com/nhkim06", "6팀"));
    students.add(new Student(6, "김예림", "yeflarla923@gmail.com", "https://github.com/yerimming", "2팀"));
    students.add(new Student(7, "공서연", "gongseoyeon1@gmail.com", "https://github.com/seoyeeon", "5팀"));
    students.add(new Student(8, "황서진", "happy.clara0830@gmail.com", "https://github.com/HwangSeo", "1팀"));
    students.add(new Student(9, "김지원", "zone0728@gmail.com", "https://github.com/dony-beep", "3팀"));
    students.add(new Student(10, "장재한", "twinsjh01@gmail.com", "https://github.com/JAEHAN-JANG", "4팀"));
    students.add(new Student(11, "이채린", "leecxfls@gmail.com", "https://github.com/cxfls", "4팀"));
    students.add(new Student(12, "조준연", "junyeon03@gmail.com", "https://github.com/GJYeon", "2팀"));
    students.add(new Student(13, "김동현", "kdongh0406@gmail.com", "https://github.com/Kimd0ng", "1팀"));
    students.add(new Student(14, "석정한", "jhstone034679@gmail.com", "https://github.com/JungHan-Seok", "5팀"));
    students.add(new Student(15, "문수호", "50031593msh@gmail.com", "https://github.com/moonsuho", "2팀"));
    students.add(new Student(16, "이종원", "ji140126@gmail.com", "https://github.com/jongwon-810", "2팀"));
    students.add(new Student(17, "김도현", "kh9015548@gmail.com", "https://github.com/dodo5517", "4팀"));
    students.add(new Student(18, "김혜진", "anne37053@gmail.com", "https://github.com/jin3574", "4팀"));
    students.add(new Student(19, "강태훈", "rhcharles0@gmail.com", "https://github.com/rhcharles0", "6팀"));
    students.add(new Student(20, "김충훈", "chunghun0513@gmail.com", "https://github.com/kchun0513", "6팀"));
    students.add(new Student(21, "정민규", "samu9nai@gmail.com", "https://github.com/samu9nai", "1팀"));
    students.add(new Student(22, "황현진", "jjini231027@gmail.com", "https://github.com/hyeonjin6530", "4팀"));
    students.add(new Student(23, "김유환", "a01091238199@gmail.com", "https://github.com/2019147588", "3팀"));
    students.add(new Student(24, "김현지", "jikim567@gmail.com", "https://github.com/mendi5603", "5팀"));
    students.add(new Student(25, "백광훈", "bkh010914@gmail.com", "https://github.com/HUN0914", "3팀"));
    students.add(new Student(26, "김혜빈", "vveny113@gmail.com", "https://github.com/hyevin99", "1팀"));
    students.add(new Student(27, "장아연", "robinround77@gmail.com", "https://github.com/bigwaveBigwave", "3팀"));

    // 방법1. Comarable (클래스 내부에 기본 정렬 기준 정의)
    // ID 기준 오름차순 정렬
    for (Student s : students) {
      System.out.print("s.getId() = " + s.getId());
      System.out.println("  s.getName() = " + s.getName());
    }

    System.out.println("=================Comparator==================");

    // 방법2. Comparator (외부에서 별도의 정렬 기준 제공)
    // 이름 사전순 정렬

    // 2-1) TreeSet 생성자 내부에 Comparator 객체 생성 -> Comparator class 기준 정렬
//    Set<Student> students2 = new TreeSet<>(new StudentComparatorByName());

    // 2-2) 익명구현객체 방식으로 Comparator 구현
//    Set<Student> students2 = new TreeSet<>(new Comparator<Student>() {
//      @Override
//      public int compare(Student o1, Student o2) {
//        return o1.getName().compareTo(o2.getName());
//      }
//    });

    // 2-3) lambda로 Comparator 구현
    Set<Student> students2 = new TreeSet<>(
            (Student o1, Student o2) -> o1.getName().compareTo(o2.getName())
    );

    students2.addAll(students);  // 기존 데이터 복사
    for (Student s : students2) {
      System.out.print("s.getId() = " + s.getId());
      System.out.println("  s.getName() = " + s.getName());
    }

    System.out.println("==========================================");


    // 팀 인원수 기준 내림차순 정렬
    // 팀 인원수 같으면 팀명 오름차순 정렬
    // 같은 팀이면 이름순 오름차순 정렬
    // => 1. 팀인원수(내림차순) 2. 팀명 3. 이름

    List<Student> list = new ArrayList<>(students);

    // <팀명, 팀 인원수> Map 생성
    Map<String, Integer> teamCount = new HashMap<>();

    // list 돌면서 teamCount Map에 key: 팀명, value: 팀 인원수 저장
    for (Student s : list) {
      teamCount.put(
              s.getTeam(),
              // key에 해당하는 value있으면 value 반환, 없으면 기본값(0) 반환
              teamCount.getOrDefault(s.getTeam(), 0) + 1
      );
    }
    // 정렬 class 기준 list 정렬
    list.sort(new StudentComparatorByTeamSize(teamCount));

    System.out.println("teamCount = " + teamCount);

    for (Student s : list) {
      System.out.print("학생명 = " + s.getName() + "\t");
      System.out.println("팀명 = " + s.getTeam());
    }

    System.out.println("====================================");

    // database에서 가져올 때 sql 이용해 정렬하는 경우가 일반적, 가져온 후 후처리 필요할 때 사용


    // Map Iterator 사용 불가 -> Set으로 변환 후 Iterator 사용

    // map(teamCount)에 저장된 모든 key를 Set 형태로 변환
    Set<String> keys = teamCount.keySet();

    Iterator<String> keyiter = keys.iterator();
    while (keyiter.hasNext()) {

      // Set에서 key 꺼냄
      String key = keyiter.next();

      // key로 value 가져옴
      Integer value = teamCount.get(key);

      System.out.println(key + " = " + value);
    }
  }
}
