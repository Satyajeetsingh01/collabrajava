class A 
{
	public static void demo() 
	{
		System.out.println("A");
	}
}

class B extends A
{
	public static void demo1() 
	{
		System.out.println("B");
	}
}

class C extends B
{
	public static void demo2() 
	{
		System.out.println("C");
	}
}


class Driver2
{
	public static void main(String[] args) 
	{
		A obj1=new A();
		obj1.demo();  //A
		System.out.println("============");

		A obj2=new B();
		obj2.demo();  //A
		System.out.println("============");

		A obj3=new C();
		obj3.demo(); //A
		//obj3.demo1();//CTE
		//obj3.demo2();//CTE
		System.out.println("============");

		/*B obj4=new A();
		obj1.demo();                          O/P= CCE
		System.out.println("============");*/

		B obj5=new B();
		obj5.demo();  //A
		obj5.demo1(); //B
		System.out.println("============");

		B obj6=new C();
		obj6.demo();  //A
		obj6.demo1(); //b
		//obj6.demo2(); //CTE
		System.out.println("============");

		/*C obj1=new A();
		obj1.demo();                         O/P= CCE
		System.out.println("============");*/

		/*C obj2=new B();
		obj2.demo();  //A                    O/P= CCE
		System.out.println("============");*/

		C obj7=new C();
		obj7.demo(); //A
		obj7.demo1();//B
		obj7.demo2();//C
	}
}
