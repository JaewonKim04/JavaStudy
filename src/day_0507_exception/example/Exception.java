package day_0507_exception.example;

public class Exception {
	public static void main(String[] args) {
		String data = null;
		System.out.println(data.toString());
		
		//에러:__컴퓨터 하드웨어의 오동작 또는 고장__으로 인해 응용프로그램 실행 오류가 발생하는 것
		
		//예외:__사용자의 잘못된 조작 또는 개발자의 잘못된 코딩__으로 인해 발생하는 프로그램 오류
		/**
		 * 예외가 발행되면 프로그램을 종료된다는 점에서 에러와 동일
		 * 
		 * but,예외는 예외 처리를 통해 프로그램을 종료하지 않고 정상 실행 상태가 유지되도록 할 수 있다.
		 */
		/**
		 * 일반 예외: 컴파일 시 예외 처리 코드 검사(o)-예외 처리 코드가 없으면 컴파일 오류
		 * 		->강제적으로 예외 처리 코드 작성 요구
		 * 
		 * 실행 예외:컴파일 시 예외처리 코드 검사(x)
		 * 		->예외 처리 코드를 개발자의 경험을 바탕으로 작성해야 한다.
		 * 
		 * 두가지 예외는 모두 예외처리코드가 필요
		 * 예외처리코드가 없을경우 해당 예외가 발생하면 프로그램은 곧바로 종료됨
		 */
		/**
		 * 자주 발생되는 실행 예외들
		 * 1.NullPointerException
		 * 2.ArrayIndexOutOfBoundsException
		 * 3.NumberFromatException
		 * 4.ClassCastException
		 */
		/**
		 * 예외처리코드: 프로그램에서 예외가 발생했을 경우 프로그램의 갑작스러운 종료를 막고, 정상 실행을 유지할 수 있도록 처리하는 코드
		 * 
		 * 예외 처리 코드는 try-catch-finally블록을 이용한다
		 * try-catch-finally블록은 생성자 내부와 메소드 내부에서 작성되어 일반예외와 실행 예외가 발생할 경우 예외 처리를 할 수 있도록 해준다.'
		 * 
		 */
		try {
			//예외 발생 가능 코드
		}catch(NullPointerException e) {// 해당타입의 예외가 발생하면 처리
			//예외 처리
		}finally {
			//항상 실행
			//안넣어도 가능
		}
	}
}
