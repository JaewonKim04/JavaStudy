package day_0521_api_class;

public class SystemClass {
//운영체제의 일부 기능을 이용할 수 있다
	/**
	 * 프로그램 종료
	 * 메모리 정리
	 * 현재 시간 읽기
	 * 시스템 프로퍼티 읽기
	 * 환경 변수 읽기
	 */
	String osName = System.getProperty("os.name");
	String userName = System.getProperty("user.name");
	String userHome = System.getProperty("user.home");
}
