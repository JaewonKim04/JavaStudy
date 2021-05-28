package day_0526_generic.example_method_2;

public class Util {
		public static <T> Box<T> boxing(T t){
			Box<T> box = new Box<T>();
			box.setT(t);
			return box;
 		}
}
