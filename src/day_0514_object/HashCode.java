package day_0514_object;

public class HashCode {
	public int number;
	
	public HashCode(int number) {
		this.number=number;
	}
	
	@Override
	public int hashCode() {
		return number;
	}
}
