package ch07.sec07.exam01;

public class PromotionExample {
    public static void main(String[] args) {
        B b = new B();
        C c = new C();
        D d = new D();
        E e = new E();

        // 객체 BCDE 모두 A 상속받으므로 A로 형변환 가능
        A a1 = b;
        A a2 = c;
        A a3 = d;
        A a4 = e;

        // 객체 DE는 각각 BC로부터 상속받으므로 자동 형변환 가능
        B b1 = d;
        C c1 = e;

        // 객체 E는 객체 C를, C는 A를 상속받으므로 B로 형변환 불가
        // B b3 = e;

        // 객체 C는 A를 상속받고
        // 객체 D는 B를, B는 A를 상속받으므로 C로 형변환 불가
        // C c2 = d;
    }
}
