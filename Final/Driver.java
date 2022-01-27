 final class Demo 
{
	final static int a=20;

	static void Test()
	{
		System.out.println("Hello world");
	}
}

 class Driver extends Demo
{
	static void Test()
	{
		System.out.println("Hello");
	}

	public static void main(String[] args) 
	{
		Driver d=new Driver();
		d.Test();

	}
}
