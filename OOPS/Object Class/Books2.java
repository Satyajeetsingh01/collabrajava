//HASHCODE() METHOD EXAMPLE 3
class Books2 
{
	String bname;
	Books2(String bname)
	{
		this.bname=bname;
	}
	public static void main(String[] args) 
	{
		//=======CASE 1===========
		Books2 b1=new Books2("java");
		Books2 b2=b1;
		System.out.println(b1.bname);     //java  
		System.out.println(b2.bname);     //java
		System.out.println(b1==b2);       //true
		System.out.println(b1.equals(b2));//true
		int h1=b1.hashCode();
		int h2=b2.hashCode();
		System.out.println(h1==h2);       //true

		//=======CASE 2============
		Books2 b1=new Books2("java");
		Books2 b2=new Books2("java");
		System.out.println(b1.bname);  //java    
		System.out.println(b2.bname);  //java
		System.out.println(b1==b2);    //false
		System.out.println(b1.equals(b2));//false
		int h1=b1.hashCode();
		int h2=b2.hashCode();
		System.out.println(h1==h2);  //false
	}
}
