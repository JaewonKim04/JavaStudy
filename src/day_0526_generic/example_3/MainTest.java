package day_0526_generic.example_3;

import day_0526_generic.example_box_2.Box;

public class MainTest {
	public static void main(String[] args) {
		Box<Integer> box1 = new Box<Integer>();
		box1.setT(47);
		Integer getInt = box1.getT();
		System.out.println(getInt);
		
		Box<String> box2 = new Box<String>();
		box2.setT("hello");
		String getString = box2.getT();
		System.out.println(getString);
	}
}
