abstract class Calculator 
{
	abstract public int add(int a,int b);
}

class child extends Calculator
{
	public int add(int a,int b)
	{
		return a+b;
	}
}

class Driver1
{
	public static void main(String[] args)
	{
		Calculator c=new child();
		System.out.println(c.add(2,5));
	}
}