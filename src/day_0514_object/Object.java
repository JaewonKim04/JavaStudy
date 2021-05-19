package day_0514_object;

public class Object {
	public static void main(String[] args) {
		/**
	 * equals()(객체 비교)
	 * 동일한 객체라면 true를 리턴하고 그렇지 않으면 false를 리턴한다
	 * 
	 * 직접 사용되지 않고 하위클래스에서 재정의하여 논리적으로 동등비교할때 이용
	 * String객체의 equals()메소드는 String객체의 번지를 비교하는 것이 아니고 문자열이 동일한지 조사함
	 * String 클래스가 Object의 equals() 메소드를 재정의해서 문자열 비교로 변경했기 때문
	 */
	Object obj1 = new Object();
	Object obj2 = new Object();
	
	boolean result = obj1.equals(obj2);//객체 주소비교
	System.out.println(result);
	
	boolean result1 = (obj1 == obj2);//객체 주소비교
	System.out.println(result1);
	}
	/**
	 * hashCode()(객체 해시코드)
	 * 객체 해시코드 : 객체를 식별할 하나의 점수값(객체마다 다른 값을 갖고있다)
	 * hashCode(): 객체의 메모리 번지를 이용해서 해시코드를 만들어 리턴
	 * 논리적 동등비교: hashCode9)를 오버라이딩할 필요성이 있다.
	 * 컬렉션 프레임워크의 HashSet,HashMap과 같은 클래스는 두 객체가 동등한 객체인지 판단할 때 아래와 같은 과정을 거침
	 * hashCode()리턴값 같음-> equals() 리턴값 	->true = 동등객체
	 * 										->false =다른객체
	 * 			 리턴값 다름 = 다른객체
	 */
	
	/**
	 * toString()
	 *  클래스명 @16진수해시코드로 구성된 문자 정보를 리턴한다.
	 *  System.out.println() 메소드 사용시
	 *  - 매개값이 기본 타입일 경우 해당 값을 그대로 출력
	 *  - 매개값으로 객체를 줄 경우 객체의 toString() 메소드를 호출해서 리턴값을 받아 출력
	 */
}
