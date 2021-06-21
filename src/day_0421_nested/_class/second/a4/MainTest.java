package day_0421_nested._class.second.a4;

public class MainTest {
	public static void main(String[] args) {
		Outter out = new Outter();
		Outter.Nested nest = out.new Nested();
		nest.print();
	}
}
