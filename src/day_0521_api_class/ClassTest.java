package day_0521_api_class;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class ClassTest {
	/**
	 * 자바는 클래스와 인터페이스의 메타 데이터를 java.lang 패키지에 소속된 class 클래스로 관리한다
	 * 매타데이터:필드,메서드,생성자의 정보
	 */
	public static void main(String[] args) throws Exception{
		Class clazz = Class.forName("day_0521_api_class.GcTest");
		
		Constructor[] con = clazz.getDeclaredConstructors();//생성자정보(여러개 일수 있어서 배열형태)
		Class[] param= con[0].getParameterTypes();//첫번째 파라미터 타입
		
		Field[] a=clazz.getDeclaredFields();//필드정보들을 얻어옴
		
		Method[] b=clazz.getDeclaredMethods();//메소드 정보들을 얻어옴
	}
}
