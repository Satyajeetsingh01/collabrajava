class Employee 
{
	private int id;
	private String name;
	private double salary;

	public int getid()
	{
		return id;
	}

	public void setid(int id)
	{
		this.id=id;
	}

	public String getname()
	{
		return name;
	}

	public void setname(String name)
	{
		this.name=name;
	}

	public double getsalary()
	{
		return salary;
	}

	public void setsalary(double salary)
	{
		this.salary=salary;
	}

	Employee(int id,String name,double salary)
	{
		this.id=id;
		this.name=name;
		this.salary=salary;
	}

	public String toString()
	{
		return "id is:"+id+"\n"+ "name is:"+name+"\n"+"salary is"+salary;
	}

	public boolean equals(Object o)
	{
	Employee e=(Employee)o;
	if((this.id==e.id)&&(this.name==e.name)&&(this.salary==e.salary))
	{
		return true;
	}
	else
	{
		return false;
	}
	}

	public int hashCode()
	{
		int hc1=id;
		int hc2=(int)salary;
		int hc=hc1+hc2;
		return hc;
	}
	public static void main(String[] args) 
	{
		Employee e1=new Employee(01,"sanu",10000.0);
		Employee e2=new Employee(02,"raj",2000.0);
		Employee e3=new Employee(01,"sanu",10000.0);
		System.out.println(e1.toString());
		System.out.println(e1.equals(e3));
		System.out.println(e1.equals(e2));
		int hc3=e1.hashCode();
		int hc4=e3.hashCode();
		System.out.println(hc3==hc4);


	}
}
