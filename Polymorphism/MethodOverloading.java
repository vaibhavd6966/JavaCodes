package Polymorphism;

class A{
	void m1() {
		System.out.println("I am m1 default");
	}
	void m1(int a) {
		System.out.println("I am m1 with 1 Parameter");
	}
	protected void m1(String s) {
		System.out.println("I am m1 with 1 reference type");
	}
}
class B extends A{
	int m1(int n, int m) {
		System.out.println("I am m1 of B");
		return n+m;
	}
}
public class MethodOverloading {
	public static void main(String[] args) {
		B ob= new B();
		
		ob.m1();
		ob.m1(10);
		ob.m1(10, 20);
		ob.m1(null);
	}
}
