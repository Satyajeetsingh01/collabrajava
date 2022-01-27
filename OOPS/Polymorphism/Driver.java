class A
{
	int a=10;
	int b=20;
}

class B extends A
{
	int a=30;
	int b=40;
}

class C extends B
{
	int a=50;
	int b=60;
}

class Driver
{
	public static void main(String[] args) 
	{
		A obj1=new A();
		System.out.println(obj1.a);
		System.out.println(obj1.b);
		System.out.println("========");

		A obj2=new B();
		System.out.println(obj2.a);
		System.out.println(obj2.b);
		System.out.println("========");

		A obj3=new C();
		System.out.println(obj3.a);
		System.out.println(obj3.b);
		//System.out.println(c1.c);
		System.out.println("========");

		/*B obj4=(B)new A();             op/-CCE
		System.out.println(obj4.a);*/

		B obj4=new B();
		System.out.println(obj4.a);
		System.out.println(obj4.b);
		System.out.println("========");

		B obj5=new C();
		System.out.println(obj3.a);
		System.out.println(obj3.b);
		System.out.println("========");

		//C obj6=new A();   O/P= CCE

		//C obj6=new B();   O/P= CCE

		C obj6=new C();
		System.out.println(obj6.a);
		System.out.println(obj6.b);
	}
}
