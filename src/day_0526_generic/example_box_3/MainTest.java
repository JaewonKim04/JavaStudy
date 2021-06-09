package day_0526_generic.example_box_3;

public class MainTest {
	public static void main(String[] args) {
		Box<String> box1 = new Box<String>();
		box1.setT("Hello");
		String str = box1.getT();
		
		Box<Integer> box2 = new Box<Integer>();
		box2.setT(6);
		int value = box2.getT();
	}
}
