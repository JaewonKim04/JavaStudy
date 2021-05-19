package day_0514_object;

public class MemberExample {

	public static void main(String[] args) {
		Member original = new Member("blue","홍길동","12345",25,true);
		
		Member cloned = original.getMember();
		cloned.password = "67890";
		
		System.out.println("복제 객체의 password: "+ cloned.password);
		System.out.println("원복 객체의 password: "+ original.password);
				
	}
}