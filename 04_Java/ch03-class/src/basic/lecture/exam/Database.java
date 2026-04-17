package basic.lecture.exam;

import javax.xml.crypto.Data;

public class Database {

    // 싱글톤 패턴
    // - 어플리케이션에서 하나의 객체만 생성되도록 보장하는 디자인 패턴
    // - 동일한 인스턴스를 공유해 사용
    private String connection = "MYSQL";

    // 객체(인스턴스) 생성
    // 외부 클래스에서 객체를 만들지 않아도 사용가능
    private static Database database = new Database();

    // 기본생성자를 private로 접근막음
    private Database() {
    }

    // static method으로 인스턴스 변환
    public static Database getInstance() {
        return database;
    }
}
