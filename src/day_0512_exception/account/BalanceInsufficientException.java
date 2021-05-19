package day_0512_exception.account;

public class BalanceInsufficientException extends Exception {
	public BalanceInsufficientException() {
		super();
	}
	
	public BalanceInsufficientException(String s) {
		super(s);
	}
}
