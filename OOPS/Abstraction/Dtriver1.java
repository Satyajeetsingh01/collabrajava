abstract class Calculator 
{
	abstract public int add(int a,int b);
}

class Driver1 extends calculator
{
	int sum=0;
	public void add(int a,int b)
	{
		sum=a+b;
		System.out.println(sum);
	}

	public static void main(String[] args)
	{
		Calculator c=new Calculator();
		c.add(5,2);
	}
}
