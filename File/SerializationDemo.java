package File;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class SerializationDemo {
	public static void main(String[] args) {
		try {
			FileOutputStream fos =new FileOutputStream("D:/car/employee_info.txt");
			Employee emp=new Employee();
			emp.setEmpId(101);
			emp.setEmpName("Raj");
			emp.setEmpSalary(897.9F);
			ObjectOutputStream ois=new ObjectOutputStream(fos);
			ois.writeObject(emp);
			System.out.println("Success");
			ois.close();
			fos.close();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
}
