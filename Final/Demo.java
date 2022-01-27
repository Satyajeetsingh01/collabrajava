 class Demo 
{
	final static int a=20;

	 static void Test()
	{
		System.out.println("Hello world");
	}
}

class Driver extends Demo
{
	final static void Test()
	{
		System.out.println("Hello world");
	}

	public static void main(String[] args) 
	{
		Demo d=new Demo();
		d.Test();

	}
}
