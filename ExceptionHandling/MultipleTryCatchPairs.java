package ExceptionHandling;

import java.util.Scanner;

public class MultipleTryCatchPairs {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a index: ");
		int index = scan.nextInt();

		try {
			int arr[] = { 10, 20, 30, 40 };
			int value = arr[index];
			System.out.println("Your number finding index number is: " + value);
		} catch (ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
		}
		try {
			String state = "Maharashtra";
			char ch = state.charAt(index);
			System.out.println("Your index character is: " + ch);
		} catch (StringIndexOutOfBoundsException e) {
			e.printStackTrace();
		}
	}
}
