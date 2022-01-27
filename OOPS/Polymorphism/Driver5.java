class A1 
{
	public String test() 
	{
		System.out.println("A");
		return "hi";
	}
}

class B1 extends A1
{
	public String test() 
	{
		System.out.println("B");
		return "hello";
	}
}

class C1 extends B1
{
	public String test() 
	{
		System.out.println("C");
		return "sanu";
	}
}

class Driver5
{
	public static void main(String args[]) 
	{
		//A1 a= new A1();
		//System.out.println(a.test());

		/*A1 a1=new B1();
		System.out.println(a1.test());
		
		A1 a2=new C1();
		System.out.println(a2.test());*/

		B1 b=(B1)new A1();
		System.out.println(b.test());
	}
} 
