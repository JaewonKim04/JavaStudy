package day_0521_api_class.object;

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
