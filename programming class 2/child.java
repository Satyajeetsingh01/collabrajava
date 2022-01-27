class Parent 
{
	static int a=30;
	int b20;
	public static void demo() 
	{

	}

	public static void temp()
	{
		
	}
}

class Child
{
	int c=10;
	static int d=40;
}

class Driver1
{
	public static void main(String[] args)
	{
	Child c=new Child();
	Parent p=new Parent();
	if(P instanceof Parent)
	{
		Parent p1=p;
	}

	/*if(p instance of Child)
	{
		Child c1=(Child)p;
	}  */        

	if(c instanceof Child)
	{
		Child c2=c;
	}

	if(c instanceof Parent)
	{
		Parent p2=c;
	}
	}
}
