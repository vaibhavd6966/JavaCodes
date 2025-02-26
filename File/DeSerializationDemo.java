package File;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeSerializationDemo {
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		FileInputStream fileinputstream=new FileInputStream("D:/car/employee_info.txt");
		ObjectInputStream objectis= new ObjectInputStream(fileinputstream);
		Object o=objectis.readObject(); //upcasting
		Employee employee=(Employee)o; //downcasting
		System.out.println(employee);
	}
}
