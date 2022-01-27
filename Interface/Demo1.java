//interface to interface

interface Demo
{
	int a=10;
}

interface Demo1 extends Demo
{
	public static void main(String[] args)
	{
		System.out.println(Demo.a); //10
	}
}


 