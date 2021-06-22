package day_0521_api_class.object;

public class ToStringTest {
	public static void main(String[] args) {
		Object obj = new Object();
		System.out.println(obj.toString());
		
		String name = new String("이름");
		System.out.println(name.toString());
		System.out.println(name);
	}
}
