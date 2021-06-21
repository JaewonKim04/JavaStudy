package day_0421_nested._class.second.a3;

public class Outter {
	
	//자바 7이전 까지는
	//final 키워드 없이 선언된 매개변수나 로컬 변수를
	//로컬 클래스에서 사용하면 컴파일 에러가 발생했다
	public void method1(final int arg) {
		final int localVariable = 1;
		class Inner{
			public void method() {
				int result = arg+ localVariable;
			}
		}
	}
	
	//자바 8 이후
	public void method2(int arg) {
		int localVariable = 1;
		int a = 0;
		class Inner{
			public void method() {
				int result = arg + localVariable;
			}
		}
	}

}
