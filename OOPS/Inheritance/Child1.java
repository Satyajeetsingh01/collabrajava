class Parent1 
{
	int a;
	int b;
	Parent1(int a,int b)
	{
		this.a=a;
		this.b=b;
	}
}
	
class Child1 extends Parent1
{
	int c;
	public static void main(String[] args) 
	{
		Child1 c1=new Child1();
		System.out.println(c1.a);
	}
}
