package day_0526_generic;
import day_0526_generic.example_box_2.Box;
public class GenericMethod {
	//제네릭 메소드는 매개 타입과 리턴 타입으로 타입 파라미터를 갖는 메소드이다
	
	// 선언방법: 리턴 타입 앞에 <> 기호를 추가하고 타입 파라미터를 기술 후, 리턴 타입과 매개 타입으로 타입 파라미터를 사용
	
	public <T> String method(String str) {return str+"returned";}
	public <T> T boxing(T t){return t;}
}
