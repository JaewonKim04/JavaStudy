package day_0526_generic.example_extends_generic;

public class ChildProduct<T,M,C> extends Product<T,M> {
	private C company;
	public C getCompany() {return this.company;}
	public void setCompany(C company) {this.company = company;}
}
