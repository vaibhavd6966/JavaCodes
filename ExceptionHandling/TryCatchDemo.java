package ExceptionHandling;

public class TryCatchDemo {
	public static void main(String[] args) {
		try {
			int a=10;
			int b=0;
			int c=a/b;
			System.out.println(c);
		} catch (Exception ae) {
			String msg=ae.getMessage();
			System.err.println("Divide by zero error occured please check server message: "+ msg);
		}
	}
}
