package test_2104;

public class TourBus extends Bus {
	TourBus(int number){
		this.number=number;
	}
	@Override
	public void ride() {
		System.out.println("welcome! you ride "+number+" TourBus");
	}
}
