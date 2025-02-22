package Abstraction;
//write a java application for student management system make student as abtsract class and create mandatory functions for set basic information and college details creatte optional functionality social media accounts extend this studnet class with teacher, clerk, and HOD. with the help of teacher, clerk hod display the details in college main class.
abstract class Student{
	abstract void setDetails();
	abstract void collegeInfo();
	void socialMedia() {
		
	}
}
class Teacher extends Student{

	@Override
	void setDetails() {
		// TODO Auto-generated method stub
		System.out.println("I am setdetails in teacher");
	}

	@Override
	void collegeInfo() {
		// TODO Auto-generated method stub
		System.out.println("I am collegeinfo in teacher");
	}
	@Override
	void socialMedia() {
		System.out.println("I am social media in teacher");
	}
}
class HOD extends Student{

	@Override
	void setDetails() {
		// TODO Auto-generated method stub
		System.out.println("I am setdetails in HOD");
	}

	@Override
	void collegeInfo() {
		// TODO Auto-generated method stub
		System.out.println("I am collegeinfo in HOD");
	}
	
}
class Clerk extends Student{

	@Override
	void setDetails() {
		// TODO Auto-generated method stub
		System.out.println("I am setdetails in clerk");
	}

	@Override
	void collegeInfo() {
		// TODO Auto-generated method stub
		System.out.println("I am collegeinfo in clerk");
	}
	
}
public class StudentMIS {
	public static void main(String[] args) {
		Student teacher=new Teacher();
		teacher.setDetails();
		teacher.collegeInfo();
		teacher.socialMedia();
		Student hod=new HOD();
		hod.setDetails();
		hod.collegeInfo();
		Student clerk=new Clerk();
		clerk.setDetails();
		clerk.collegeInfo();
	}
}
