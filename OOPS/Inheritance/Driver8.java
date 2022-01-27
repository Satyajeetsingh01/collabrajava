class A 
{
	public void testA()
	{
		System.out.println("test A");
	}
}

class B extends A
{
	public void testB()
	{
		System.out.println("test B");
	}
}

class C extends B
{
	public void testC()
	{
		System.out.println("test C");
	}
}

class D extends B
{
	public void testD()
	{
		System.out.println("test D");
	}

}

class Driver8
{
	public static void main(String[] args) 
	{
		new A(); //has instance of A
		new B(); //has instance of A and B
		new C(); //has instance of A , B AND C
		new D(); //has instance of A,B,D.

		A obj1;//can access instance of only A
		B obj2;//can access instance of  A AND B
		C obj3;//can access instance of  A,B,C
		D obj4;//can access instance of A,B,D

		A obj1 =new A();//consists members of only A
		B obj2 =new B();//consists members of A and B
		C obj3 =new C();//consists members of A,B,C
		D obj4 =new D();//consists members of A,B,D

		A obj1=new D();//UPCASTING // ONLY INSTANCE OF A
		A obj2=new C();//UPCASTING // ONLY INSTANCE OF A
		D obj3=(D)new A();//DOWNCASTING // CLASSCASTEXCEPTION//DOESN'T HAVE INSTANCES OF D,B //EXPLICIT CONVERSION
		C obj4=new D();//CTE // C AND D CLASSES ARE NOT RELATED
		B obj5=new C();//UPCASTING // ONLY INSTANCE OF A AND B
		B obj6=new D();//UPCASTING // ONLY INSTANCE OF A AND B
		B obj7=new D();//UPCASTING // ONLY INSTANCE OF A AND B
		B obj8=(B)new A();//DOWNCASTING // CLASSCASTEXCEPTION// DOESN'T HAVE INSTANCES OF B //EXPLICIT CONVERSION
		D obj9=new C();//CTE // C AND D CLASSES ARE NOT RELATED
		
		boolean flag = new D() instanceof B;
		System.out.println(flag); // true e

	}
}
