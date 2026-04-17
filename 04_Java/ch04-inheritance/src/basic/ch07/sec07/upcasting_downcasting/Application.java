package basic.ch07.sec07.upcasting_downcasting;

public class Application {
    public static void main(String[] args) {
        A a = new A();
        B b = new B();
        C c = new C();
        D d = new D();
        E e = new E();

        // B instance 생성, A type으로 자동 형변환 (upcasting)
        // 업케스팅
        // 타입을 자식 -> 부모로 자동 형변환
        A a1 = new B();
        A a2 = new C();
        B a3 = new D();

        // 다운캐스팅
        // 부모 -> 자식 자동 형변환 불가
        // 부모(A) -> 자식(B)로 다운캐스팅, 형변환 가능
        B b2 = (B) a1;

    }
}
