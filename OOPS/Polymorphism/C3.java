class A3 
{
	int a=10;
	int b=20;
}

class B3 extends A3
{
	int c=30;
	int d=40;
}

class C4 extends B3
{
	int e=50;
}

	class C3
	{
		public static void main(String[] args) 
	{
		A3 a1=new B3();
		System.out.println(a1.b);
		//B3 b2=new C4();
		//C4 b1=(C4)a1;
		//System.out.println(b1.a);
		//B3 b1=(B3)new A3();

	}
	}

