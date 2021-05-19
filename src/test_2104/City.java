package test_2104;

public class City extends Space{
	Park a;
	TourBus bus;
	City(String name,Park park,TourBus bus) {
		super(name);
		this.a=park;
		this.bus=bus;
	}
	@Override
	public void enterCity() {
		System.out.println(a.name+" and "+bus.number+" bus are in "+name);
	}

}
