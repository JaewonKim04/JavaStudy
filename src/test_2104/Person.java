package test_2104;

public class Person {
	String name;
	int age;
	public Person(String name,int age){
		this.name=name;
		this.age=age;
	}
	public void letsDo(Park a,int fee) {
		a.enter(fee);
	}
	public void letsDo(Park a,String city) {
		a.enter("Busan");
	}
	public void letsDo(TourBus bus) {
		bus.ride();
	}
	
}
