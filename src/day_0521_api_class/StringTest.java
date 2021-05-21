package day_0521_api_class;

public class StringTest {
    //배열 전체를 String 객체로 생성
	static byte[] bytes = {1,2,3,4,5,6};
	static String str = new String(bytes);
	
	//배열의 offset 인덱스 위치부터 length만큼 생성
	String str2 = new String(bytes, 6,4);
	
	public static void main(String[] args) {
		str.length();//총 문자의 수를 리턴
	}
	
	//equals() : Object클래스의 equals()를 재정의함 - 문자열을 비교함
	/**
	 *
	 */
}
