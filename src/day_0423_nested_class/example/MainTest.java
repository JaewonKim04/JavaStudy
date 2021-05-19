package day_0423_nested_class.example;

public class MainTest {
	public static void main(String[] args) {
		Button btn = new Button();

		btn.setOnclickListener(new CallListener());
		btn.touch();
		
		btn.setOnclickListener(new MessageListener());
		btn.touch();
	}
}
