package day_0526_generic.example_box_2;

public class Test {
	void test() {
		Box<String> box = new Box<String>();
		box.setT("hello");
		String getStr = box.getT();
	}//저장할때와 읽어올때 전혀 타입변환이 발생하지 않는다
}
