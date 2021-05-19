package test_2104;

public class Main {
	
	public static void main(String[] args) {
		Bus bus;
		TourBus tourBus;
		Park park;
		Person person;
		Space space;
		City city;
		bus=new Bus();
		tourBus=new TourBus(47);
		park=new Park("busanPark");
		person=new Person("JaeWonKim",18);
		space=new Space("Busan");
		city=new City("Busan",park,tourBus);
		
		space.enterCity();
		System.out.println();
		city.enterCity();
		person.letsDo(park,1000);
		person.letsDo(park, "Busan");
		System.out.println();
		bus.ride();
		person.letsDo(tourBus);
	}
}
