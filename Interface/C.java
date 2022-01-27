class A 
{
	public void demo() 
	{
		System.out.println("Hello World!");
	}
}

interface B
{
	public void demo(); 
}

 class C extends A implements B
{
	public static void main(String[] args)
	{
		A a=new A();
		B b=(B)a;

	}
}