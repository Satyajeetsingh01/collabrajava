class Parent1 
{
	int a=10;
	int b=20;
}

class Parent2 extends Parent1
{
	int c;
}

class mli extends Parent2
{
	int d=50;
	public static void main(String[] args) 
	{
		mli m =new mli();
		System.out.println(m.a);
		System.out.println(m.b);
		System.out.println(m.c);
		System.out.println(m.d);
	}
}
