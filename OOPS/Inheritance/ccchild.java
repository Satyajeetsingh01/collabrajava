class Parent 
{
	int a=10;
	int b=20;
}

class cchild extends Parent
{
	int c;
}

class ccchild extends Parent
{
	int d=20;
	public static void main(String[] args) 
	{
		ccchild c1=new ccchild();
		System.out.println(c1.a);
		System.out.println(c1.b);
		System.out.println(c1.c);
		System.out.println(c1.d);
	}
}
