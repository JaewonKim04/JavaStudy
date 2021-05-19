package day_0507_exception.array_index_out_of_bounds;

public class ArrayIndex {
	public static void main(String[] args) {
		String data1 = args[0];
		String data2 = args[1];
		
		System.out.println("args[0]: "+data1);
		System.out.println("args[1]: "+data2);
	}
}
//끝나면 runtime 이랑 exception 해보기