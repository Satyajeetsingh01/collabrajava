//interafce1,interafce2 to interface

interface Demo
{
	int a=10;
}

interface Demo2
{
	int b=20;
}

interface Demo3 extends Demo,Demo2
{
	public static void main(String[] args)
	{
		System.out.println(Demo.a);//10
		System.out.println(Demo2.b);//20
	}
}


 