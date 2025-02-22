package Abstraction;
abstract class A{
	void m1() {
		System.out.println("I am m1 concrete method");
	}
	abstract void m2();
}
class B extends A{
	void m3() {
		System.out.println("I am m3 concrete method");
	}
	@Override
	void m2() {
		// TODO Auto-generated method stub
		System.out.println("I am m2 concrete method");
		
	}
	
}
public class AbstractClassDemo {
	public static void main(String[] args) {
		B obj=new B();
		
		obj.m1();
		obj.m2();
		obj.m3();
	}
}
