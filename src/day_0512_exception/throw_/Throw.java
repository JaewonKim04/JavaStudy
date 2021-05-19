package day_0512_exception.throw_;

public class Throw {
	//예외 떠넘기기
	// 경우에 따라 메소드를 호출한 곳으로 예외를 떠넘길 수도 있다
	//throws 키워드는 메소드 선언부 끝에 작성되어 메소드에서 처리하지 않은 예외를 호출한 곳으로 떠넘기는 역할
	public void method1() {
		try {
			method2();
		}catch(ClassNotFoundException e) {
			//예외 처리 코드
		}
	}
	public void method2() throws ClassNotFoundException{
		Class clazz = Class.forName("java.lang.String2");
		throw new ClassNotFoundException("클래스가 없다");
	}
	/**
	 * 떠넘겨진 메소드에서도 throws 키워드로 다시 예외를 떠넘길 수 있다
	 * 
	 * main메소드에서도 throws키워드를 사용해서 예외를 떠넘길 수 있다
	 * ->결국 JVM이 최종적으로 예외처리를 함
	 */
}
