package test_2104;

public class Park {
	int fee;
	String name;
	Park(String name){
		this.name=name;
	}
	public void enter(int fee) {
		System.out.println(name+"'s fee is "+fee);
	}
	public void enter(String city) {
		System.out.println(city+" person can enter for free");
	}
}
