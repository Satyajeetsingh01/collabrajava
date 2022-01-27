// compareTo method to sort INCOMPARABLE TYPE OF ARRAY ELEMENTS.
import java.util.Arrays;
class  Employee implements Comparable
{
	String name;
	double salary;

    public int compareTo(Object o)
	{
		Employee e=(Employee)o;
		/*if(this.salary>e.salary)
			return 1;
		else if(this.salary<e.salary)
			return -1;
		else
			return 0;*/
			return (int)(this.salary-e.salary);// for ascending order
			//return (int)(e.salary-this.salary);// for descending order

	}

	/* public int compareTo(Object o)
	{
		Employee e=(Employee)o;   // string class has its own implementation for comparable interface and will compare the string state present in that object
		return this.name.compareTo(e.name);
	}*/



	public static void main(String[] args) 
	{
		Employee[] emp={new Employee("saNu",60), new Employee("San",6000),new Employee("sA",600),new Employee("s",60000)};

		Arrays.sort(emp);

		for(int i=0;i<emp.length;i++)
		{
			emp[i].display();
		}
	}

	public void display()
	{
		System.out.println("Employee name: "+name);
		System.out.println("Salary: "+salary);
		System.out.println();
	}

	Employee(String name, double salary)
	{
		this.name=name;
		this.salary=salary;
	}

}
