import java.util.Scanner;
class Tyabc 
{
	int eid;
	String name;
	double salary;
	public void toSetAttributes() 
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the emp id");
		eid=s.nextInt();
		System.out.println("Enter the emp name");
		name=s.nextLine();
		name=s.nextLine(); 
		System.out.println("Enter the emp salary");
		salary=s.nextDouble();
	}
	public void toPrintAttributes()
	{
		System.out.println("eid:" +eid);
		System.out.println("name:"+name );
		System.out.println("salary:" +salary);
	}
}

class Tyabc1
{
	public static void main(String[] args)
	{
		Tyabc e1=new Tyabc();
		System.out.println("employee 1st details");
		System.out.println("================");
		e1.toSetAttributes();
		e1.toPrintAttributes();

		Tyabc e2=new Tyabc();
		System.out.println("employee 2nd details");
		System.out.println("================");
		e2.toSetAttributes();
		e2.toPrintAttributes();

		Tyabc e3=new Tyabc();
		System.out.println("employee 3rd details");
		System.out.println("================");
		e3.toSetAttributes();
		e3.toPrintAttributes();
	}

}

