package ExceptionHandling;

public class InsufficientBalance extends Exception {
	String msg;

	public InsufficientBalance(String msg) {
		super(msg);
		this.msg = msg;
	}
	
}
