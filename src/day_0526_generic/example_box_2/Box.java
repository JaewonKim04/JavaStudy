package day_0526_generic.example_box_2;

public class Box<T> { //Box<T>: 제네릭 타입 -> T:타입이 올 수 있는 친구(타입파라미터)
	private T t;
	public void setT(T t) {this.t = t;}
	public T getT() {return t;}
}
