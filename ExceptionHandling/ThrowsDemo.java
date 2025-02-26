package ExceptionHandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

class Demo{
	String readFile(File filename) throws FileNotFoundException{
		Scanner sc=new Scanner(filename);
		return sc.nextLine();
	}
}
public class ThrowsDemo {
	public static void main(String[] args) throws FileNotFoundException {
		Demo demo=new Demo();
		File file=new File("D:/car/employee_info.txt");
		String s=demo.readFile(file);
		System.out.println(s);
	}
}
