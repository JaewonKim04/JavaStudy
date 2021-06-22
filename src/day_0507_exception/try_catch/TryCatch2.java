package day_0507_exception.try_catch;

public class TryCatch2 {
	public static void main(String[] args) {
		String data = null;
		String data1 = null;
		try {
			data = args[0];
			data1 = args[1];
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("실행 매개값의 수가 부족합니다.");
		}
		
		//다중 catch
		//상위 예외 클래스가 하위 예외 클래스보다 아래쪽에 위치해야한다
		try {
			int value1 = Integer.parseInt(data);
			int value2 = Integer.parseInt(data1);
			int result = value1 + value2;
			System.out.println(data + "+" + data1 + "=" + result);
		}catch(NumberFormatException e) {
			System.out.println("숫자로 변환할 수 없습니다.");
		}catch(Exception e) {
			System.out.println("예외발생!");
		}finally {
			System.out.println("다시실행하세요.");
		}
		
		//멀티 catch
		try {
			
		}
		catch(NullPointerException | ClassCastException e) {
			
		}
	}
	
	
}
