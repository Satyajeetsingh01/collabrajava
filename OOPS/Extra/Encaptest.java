class Number 
{
	private int sid;
	private String name;
	private int age;

	public void printat()
	{
		System.out.println(sid);
		System.out.println(name);
		System.out.println(age);
	}
}

class EncapTest 
{
	public static void main(String[] args) 
	{
		Number n1=new Number();
		n1.printat();
		
	}
}
