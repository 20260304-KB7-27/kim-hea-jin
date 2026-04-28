package lecture.compare;

import java.util.Comparator;
import java.util.Map;

public class StudentComparatorByTeamSize implements Comparator<Student> {

  // 정렬기준 1. 팀인원수(내림차순) 2. 팀명 3. 이름


  // Map
  // - Key Value 쌍으로 저장
  // - Key 역할: Value 찾기 위함, 중복X (Value는 중복O)
  // - get(key): key에 해당하는 value 반환
  // - put(key, value): Map에 데이터 추가


  // 팀 인원수 저장할 field
  // Map<팀명, 인원수>
  private Map<String, Integer> teamCount;

  public StudentComparatorByTeamSize(Map<String, Integer> teamCount) {
    this.teamCount = teamCount;
  }

  @Override
  public int compare(Student o1, Student o2) {

    // get(key) -> value 반환
    int size1 = teamCount.get(o1.getTeam());
    int size2 = teamCount.get(o2.getTeam());

    // 1. 팀 인원수 내림차순 정렬
    if (size1 != size2) {

      // 내림차순 정렬  |  (size1, size2) -> 오름차순
      return Integer.compare(size2, size1);
    }

    // 2. 팀명 오름차순 정렬
    // 팀명 기준 compare 결과값 (음수, 0, 양수) 반환
    int teamCompare = o1.getTeam().compareTo(o2.getTeam());
    if (teamCompare != 0) {
      return teamCompare;
    }

    // 3. 이름 오름차순 정렬
    // 이름 기준 compare 결과값 (음수, 0, 양수) 반환
    return o1.getName().compareTo(o2.getName());
  }
}
