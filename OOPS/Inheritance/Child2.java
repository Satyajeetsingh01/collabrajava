class Parent2 
{
	int a;
	int b;
	Parent2(int a,int b)
	{
		this.a=a;
		this.b=b;
	}
}
	
class Child2 extends Parent2
{
	int c;
	Child2()
	{
		super(10,20);
	}
	public static void main(String[] args) 
	{
		Child2 c2=new Child2();
		System.out.println(c2.c);
	}
}
