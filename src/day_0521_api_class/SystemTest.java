package day_0521_api_class;

public class SystemTest {
	public static void main(String[] args) {
		String name = System.getenv("OS");
		System.out.println("os:"+name);
	}
}
