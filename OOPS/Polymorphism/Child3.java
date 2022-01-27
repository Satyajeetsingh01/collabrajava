//METHOD OVERRIDING
class Parent3
{
	public void test() 
	{
		System.out.println("From Parent");
	}
}

class Child3 extends Parent3
{
	public void test() 
	{
		System.out.println("From Child");
	}

	public static void main(String args[]) 
	{
		Parent3 p= new Child3();
		p.test();
	}
}
