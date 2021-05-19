package day_0421_nested.example1;

public class MainTest {
	public static void main(String[] args) {
		Vehicle vehicle = new Bus();
		vehicle.run();
		//vehicle.checkFare(); Vehicle 인터페이스에는 checkFare()이 없음
		
		Bus bus = (Bus)vehicle;
		bus.run();
		bus.checkFare();
	}
}
