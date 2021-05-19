package day_0507_exception.try_catch;

public class TryCatch {
	public static void main(String[] args) {
		try {
			Class clazz = Class.forName("java.lang.String2");
		}catch(ClassNotFoundException e) {
			System.out.println("클래스가 존재하지 않습니다.");
		}finally {
			System.out.println("finally는 항상 실행!");
		}
	}
}
