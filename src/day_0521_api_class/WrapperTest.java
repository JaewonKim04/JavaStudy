package day_0521_api_class;

public class WrapperTest {
	//포장 객체 : 기본 타입의 값을 내부에 두고 포장한 객체
	//포장 객체의 특징 : 포장하고 있는 기본 타입 값은 외부에서 변경 불가
	
	//equals() : Object클래스의 equals()를 재정의함 - 기본타입의 값
	
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
