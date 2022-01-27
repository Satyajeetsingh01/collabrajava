class A 
{
	int a=10;
	int b=20;

	public void display()
	{
		System.out.println("hello");
	}
}

class B extends A
{
	int c=30;
	int d=40;
	double e=10.0;

	public static void main(String[] args)
	{
	B b1=new B();

	b1.display();
	System.out.println(b1.a);
	System.out.println(b1.b);
	System.out.println(b1.c);
	System.out.println(b1.d);
	System.out.println(b1.e);
	}	
}
