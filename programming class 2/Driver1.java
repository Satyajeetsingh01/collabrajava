//EXAMPLE ON INSTANCEOF OPERATOR WITH INHERITANCE
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

class Child extends Parent
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

	if(p instanceof Parent)
	{
		Parent p1=p;   // CTS
	}

	if(p instanceof Child)
	{
		Child c1=(Child)p;  // CTS
	}       

	if(c instanceof Child)
	{
		Child c2=c;    //CTS
	}

	if(c instanceof Parent)
	{
		Parent p2=c;       // CTS
	}
	}
}
