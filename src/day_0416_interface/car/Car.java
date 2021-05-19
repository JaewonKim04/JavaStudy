package day_0416_interface.car;

public class Car {
	Tire[] tires = {new HankookTire(),new HankookTire(),new HankookTire(),new HankookTire()};
	void run() {
		for(Tire tire:tires) {
			tire.roll();
		}
	}
}
