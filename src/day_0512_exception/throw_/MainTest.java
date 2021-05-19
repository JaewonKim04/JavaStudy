package day_0512_exception.throw_;

public class MainTest {

	public static void main(String[] args) {
		try {
			findClass();
		}catch(ClassNotFoundException e) {
			System.out.println(e);
		}
	}
	
	public static void findClass() throws ClassNotFoundException{
		Class clazz = Class.forName("java.lang.String2");

		throw new ClassNotFoundException("클래스가 없다");
	}

}
