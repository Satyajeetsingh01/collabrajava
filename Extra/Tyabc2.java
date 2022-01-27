class Tyabc
{
	int eid;
	String name;
	double salary;
	public void toSetAttributes(int eid, String name, double salary) 
	{
		this.eid=eid;
		this.name=name;
		this.salary=salary;

	}
	public void toPrintAttributes()
	{
		System.out.println("eid:" +eid);
		System.out.println("name:"+name );
		System.out.println("salary:" +salary);
	}
}

class Tyabc2
{
	public static void main(String[] args)
	{
		Tyabc e1=new Tyabc();
		System.out.println("employee 1st details");
		System.out.println("================");
		e1.toSetAttributes(1,"sanu",10000);
		e1.toPrintAttributes();

		Tyabc e2=new Tyabc();
		System.out.println("employee 2nd details");
		System.out.println("================");
		e2.toSetAttributes(2,"manu",20000);
		e2.toPrintAttributes();

		Tyabc e3=new Tyabc();
		System.out.println("employee 3rd details");
		System.out.println("================");
		e3.toSetAttributes(2,"tanu",30000);
		e3.toPrintAttributes();
	}

}

 