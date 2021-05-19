package test;

public class B extends A {
	String name;
	int age;
	B(){}
	B(String name,int age,int num){
		super(num);
		this.name=name;
		this.age=age;
	}
	
	void run() {
		System.out.println("B실행중");
	}
}
