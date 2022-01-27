class Parent5 
{
	public static void add() 
	{
		System.out.println("add()");
	}

	public void add(int a) 
	{
		System.out.println("add(int)");
	}
}

class Child5 extends Parent5
{
	public void add(int a,double b) 
	{
		System.out.println("add(int,float)");
	}

	public static void add(int a,int b) 
	{
		System.out.println("add(int,int)");
	}
}