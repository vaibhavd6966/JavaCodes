package Polymorphism;

class Base{
	void m1() {
		System.out.println("I am m1 of Base");
	}
}
class Derived extends Base{
	void m1() {
		System.out.println("I am m1 of Derived");
	}
}
public class MethodOverriding {
	public static void main(String[] args) {
		Derived d=new Derived();
		Base b=new Base();
		b.m1();
		d.m1();
	}
}
