package day_0526_generic.example_box;

public class Test {
	Box box = new Box();
	public void test() {
		box.setObject("hello"); // String 타입을 Object 타입으로 자동 타입 변환
		String getStr = (String) box.getObject(); //Object 타입을 String타입으로 강제 타입 변환
	}
	
}
