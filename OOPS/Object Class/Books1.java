// Overriding equals(object) example
class Books1
{
	String bname;
	Books1(String bname)
	{
		this.bname=bname;
	}

	@Override
	public boolean equals(Object o)
	{
	Books1 b=(Books1)o;
	if(this.bname==b.bname)
	{
		return true;
	}
	else
	{
		return false;
	}
	}
	public static void main(String[] args) 
	{
		=======CASE 1===========
		Books1 b1=new Books1("java");
		Books1 b2=b1;
		System.out.println(b1.bname);     //java  
		System.out.println(b2.bname);     //java
		System.out.println(b1==b2);       //true
		System.out.println(b1.equals(b2));//true*/

		=======CASE 2============
		Books1 b1=new Books1("java");
		Books1 b2=new Books1("java");
		System.out.println(b1.bname);  //java    
		System.out.println(b2.bname);  //java
		System.out.println(b1==b2);    //false
		System.out.println(b1.equals(b2));//true
	}
}
