//example 2
class Parent
{
	int p=10;
}  

class Child extends Parent
{
	int c=20;
}

class Driver7
{
	public static void main(String[] args) 
	{
		Child c1=new Child();
		System.out.println(c1.p);
		System.out.println(c1.c);
		Parent p1=new Child();
		//Child c2=new Parent();
		//System.out.println(c2.c);
		System.out.println(p1.p);
		//System.out.println(p1.c);
	}
}  