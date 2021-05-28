package day_0526_generic.example_extends_generig;

public interface Storage<T> {
	public void add(T item, int index);
	public T get(int index);
}
