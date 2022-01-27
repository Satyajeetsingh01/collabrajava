//equals(object) METHOD
class Books
{
	String bname;
	Books(String bname)
	{
		this.bname=bname;
	}
	public static void main(String[] args) 
	{
		=======CASE 1===========
		Books b1=new Books("java");
		Books b2=b1;
		System.out.println(b1.bname);     //java  
		System.out.println(b2.bname);     //java
		System.out.println(b1==b2);       //true
		System.out.println(b1.equals(b2));//true

		=======CASE 2============
		Books b1=new Books("java");
		Books b2=new Books("java");
		System.out.println(b1.bname);  //java    
		System.out.println(b2.bname);  //java
		System.out.println(b1==b2);    //false
		System.out.println(b1.equals(b2)); //false
	}
}
