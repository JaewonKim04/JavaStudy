package day_0507_exception.throw_trycatch.try_catch;

public class BalanceInsufficientException extends Exception {
	public BalanceInsufficientException() {
		super();
	}
	
	public BalanceInsufficientException(String s) {
		super(s);
	}
}
