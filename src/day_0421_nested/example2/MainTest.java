package day_0421_nested.example2;

public class MainTest {
	public static void main(String[] args) {
		Driver driver = new Driver();
		
		driver.drive(new Bus());
		System.out.println();
		
		//승차요금을 체크하지 않음
		driver.drive(new Taxi());
		
	}
}
