package day_0507_exception.throw_trycatch.try_catch;

public class MainTest {
	public static void main(String[] args) {
		Account ac = new Account();
		
		ac.deposit(10000);
		System.out.println("예금액: " + ac.getBalance());
		
		try {
			ac.withdraw(30000);
		}catch(BalanceInsufficientException e){
			String message = e.getMessage();
			System.out.println(message);
			System.out.println();
			e.printStackTrace();
		}
	}
}
