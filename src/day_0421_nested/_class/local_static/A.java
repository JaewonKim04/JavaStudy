package day_0421_nested._class.local_static;

public class A {
	A(){System.out.println("A 객체가 생성됨");}
	
	//인스턴스 멤버 클래스
	class NestInstanceA{
		NestInstanceA(){
			System.out.println("NestInstanceA 객체가 생성됨");
		}
		int field1;
		void method() {};
		//static int field2;
		//static void method2(){};
	}
	
	//정적 멤버 클래스
	static class NestStaticA{
		NestStaticA(){
			System.out.println("NestStaticA 객체가 생성됨");
		}
		int field1;
		void method() {};
		
		static int field2;
		static void method2() {};
	}
	
	void method() {
		//로컬 클래스
		class NestLocalA{
			NestLocalA(){
				System.out.println("NestLocalA 객체가 생성됨");
			}
			int field1;
			void method() {};
		}
		NestLocalA a = new NestLocalA();
		a.field1=3;
		a.method();
		
	}
}
