package abstractTest;

public class Main {
	public static void main(String[] args) {
		//Phone phone = new Phone(); => 불가능
		
		SmartPhone smartPhone = new SmartPhone("김재원");
		
		smartPhone.turnOn();
		smartPhone.turnOff();
		
		smartPhone.internetSearch();
	}
}
