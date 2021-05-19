package day_0421_nested.example4;

public class MainTest {
	public static void main(String[] args) {
		ChildInterfaceA cia = new ChildInterfaceA() {
			//ParentInterface의 추상메소드 재정의
			@Override
			public void method1() {}
			
			//ChildInterfaceA의 추상메소드 재정의
			@Override
			public void method3() {}
		};
		
		ChildInterfaceB cib = new ChildInterfaceB() {

			@Override
			public void method1() {}

			@Override
			public void method3() {}
			
		};
		
		ChildInterfaceC cic = new ChildInterfaceC() {
			@Override
			public void method1() {}
			
			//디폴트 메소드 재정의
			@Override
			public void method2() {}
			
			@Override
			public void method3() {}
		};
	}
}
