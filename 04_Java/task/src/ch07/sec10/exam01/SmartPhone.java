package ch07.sec10.exam01;

public class SmartPhone extends Phone{
    SmartPhone(String owner) {
        // 부모 생성자 Phone(String owner){} 호출
        super(owner);
    }

    void internetSearch() {
        System.out.println("인터넷 검색을 합니다.");
    }
}
