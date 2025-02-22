//package TypeCasting;
class A{
	void m1() {
		System.out.println("m1 in A");
	}
}
class B extends A{
	void m2() {
		System.out.println("m2 in B");
	}
}
public class TypeCastingBasics {
	public static void main(String[] args) {
		//Syntax
		//(datatype) var
		int a=2;
		System.out.println(a);
		float f=(float)a;
		System.out.println(f);
		char ch = (char)a;
		System.out.println(ch);
		char c='R';
		System.out.println(c);
		int ascii=(int)c;
		System.out.println(ascii);
		long l=a;
		System.out.println(l);
		double d=f;
		System.out.println(d);
		
		
		//primitive to non-primitive
		Integer i=new Integer(a);
		System.out.println(i);
		Double ad=d;
		System.out.println(ad);
		Character cho=c;
		System.out.println(cho);
		
		
		//reference to primitive
		int s=i.intValue();
		System.out.println(s);
		char ok=cho;
		System.out.println(ok);
		
		
		//reference to reference 
		A oa=new A();
		oa.m1();
		//oa.m2();
	
		B ob=new B();
		ob.m1();
		ob.m2();
	
		A oaa=(A)ob;
		oaa.m1();
		//oaa.m2();
	
	
		A oaaa=new B(); //upcasting
		oaaa.m1();
//		oaaa.m2();
	
//		B obbb=new B()oaaa; //downcasting
//		obbb.m1();
//		obbb.m2();
	

		
		
		
	}
}
