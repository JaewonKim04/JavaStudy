package day_0526_generic.example_extends_generic;

public class Product<T,M> {
	private T kind;
	private M model;
	
	public void setT(T kind) {
		this.kind = kind;
	}
	public void setM(M model) {
		this.model = model;
	}
	
	public T getT() {
		return kind;
	}
	
	public M getM() {
		return model;
	}

}