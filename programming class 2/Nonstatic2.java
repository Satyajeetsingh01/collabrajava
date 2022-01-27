//Nonstatic example 2
class Nonstatic2 
{
	int a;
	static int b=20;

	public void demo() 
	{
		System.out.println("demo");
	}

	public void demo1() 
	{
		System.out.println("demo1");
	}

	public static void temp() 
	{
		System.out.println("temp");
	}
	public static void main(String[] args) 
	{
		Nonstatic2 n=new Nonstatic2();
		System.out.println(b); //20 
		System.out.println(a);  //CTE non-static variable a cannot be referenced from a static context
		demo(); //CTE non-static variable a cannot be referenced from a static context
		demo1(); //CTE non-static variable a cannot be referenced from a static context
		temp(); //temp
		n.demo(); //demo
		n.demo1(); //demo1
		n.temp(); //temp
	}
}
