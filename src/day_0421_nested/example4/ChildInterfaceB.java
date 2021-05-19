package day_0421_nested.example4;

public interface ChildInterfaceB extends ParentInterface{
	//default 메소드 재정의
	public default void method2() {
		System.out.println("C2_method2() 실행");
	}
	
	public void method3();
}
