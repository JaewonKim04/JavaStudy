package day_0521_api_class;

public class WrapperTest {
	// 박싱:기본 타입의 값을 포장 객체로 만드는 과정
	//생성자 사용
	Byte obj = new Byte((byte) 10);
	
	Byte obj1 = new Byte("10");
	
	//valueOf() 사용
	Integer obj2 = Integer.valueOf(1000);
	
	//자동 박싱
	Integer num1 = 100;
	
	
	// 언박싱: 포장 객체에서 기본타입의 값을 얻어내는 과정
	byte num = obj.byteValue();
	
	//자동 언박싱
	int value1 = obj;
	int value2 = obj + 100;
}
