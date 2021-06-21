package day_0421_nested._class.local_static;

public class MainTest {
	public static void main(String[] args) {
		A a = new A();
		
		//인스턴스 멤버 클래스 객체 생성
		A.NestInstanceA b= a.new NestInstanceA();
		b.field1=3;
		b.method();
		
		//정적 멤버 클래스 객체 생성
		A.NestStaticA c = new A.NestStaticA();
		c.field1=3;
		c.method();
		
		A.NestStaticA.field2 = 3;
		A.NestStaticA.method2();
		
		//로컬 클래스 객체 생성을 위한 메소드 호출
		a.method();
	}
}
