class Driver4
{
	public static void main(String args[]) 
	{
		Child5 obj1=new Child5();
		Parent5 obj2=obj1;
		obj2.add();
		obj2.add(10);
		//obj2.add(10,10.0); 
		//obj2.add(10,10);
		//obj2.add('a',10);
	}
}