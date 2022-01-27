////METHOD OVERERIDING BY RETURNTYPE  

class ABC 
{
	public ABC test() 
	{
		System.out.println("A");
		return new ABC();
	}
}

class XYZ extends ABC
{
	public ABC test() 
	{
		System.out.println("B");
		return new XYZ();
	}
}

class Driver6
{
	public static void main(String args[]) 
	{
		//ABC a= new ABC();
		//System.out.println(a.test());

		ABC a1=new XYZ();
		System.out.println(a1.test());
	}
}