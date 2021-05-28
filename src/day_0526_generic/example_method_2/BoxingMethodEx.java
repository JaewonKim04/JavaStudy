package day_0526_generic.example_method_2;

public class BoxingMethodEx {
	public static void main(String[] args) {
		Box<Integer> box1 = Util.<Integer>boxing(100);// 타입 파라미터를 명시적으로 알려줌
		int intValue = box1.getT();
		
		Box<String> box2 = Util.boxing("홍길동");// 타입 파라미터를 String 으로 추정
		String strValue = box2.getT();
	}
}
