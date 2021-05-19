package typeChange;

public class Test {
	public static void main(String[] args) {
		A a = new B();  //자동 타입 변환
		A a1 = new A();
		
		B b = new B();
		B b1 = (B)a1;
		B b2 = (B)a;
	}
}

class A {
	
}

class B extends A {
	
}