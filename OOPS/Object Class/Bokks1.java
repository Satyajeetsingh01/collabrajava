// Overriding equals(object) example
class b=Books1
{
	String bname;
	Books(String bname)
	{
		this.bname=bname;
	}

	@Override
	public boolean equals(Object o)
	{
		Books1 b=(Books1)o;
	}

	if(this.bname=b.bname)
	{
		return true;
	}
	else
	{
		return false;
	}
	public static void main(String[] args) 
	{
		//=======CASE 1===========
		Books b1=new Books("java");
		Books b2=b1;
		System.out.println(b1.bname);     //java  
		System.out.println(b2.bname);     //java
		System.out.println(b1==b2);       //true
		System.out.println(b1.equals(b2));//true
	}
}
