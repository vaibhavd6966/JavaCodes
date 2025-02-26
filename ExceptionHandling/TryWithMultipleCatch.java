package ExceptionHandling;

public class TryWithMultipleCatch {
	public static void main(String[] args) {
		try {
			int num = Integer.parseInt(args[0]);
			int num1 = Integer.parseInt(args[1]);
			int res = num / num1;
			System.out.println("Result: " + res);
		} catch (ArithmeticException e) {
			System.err.println(e);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.err.println(e);
		} catch (NumberFormatException e) {
			System.err.println(e);
		}
	}
}
