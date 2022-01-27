//class,interface to class

class Demo
{
	int a=10;
}

interface Demo2
{
	int b=20;
}

class Demo5 extends Demo implements Demo2
{
	public static void main(String[] args)
	{
		Demo d=new Demo();
		System.out.println(d.a);//10
		System.out.println(Demo2.b);//20
	}
}


 