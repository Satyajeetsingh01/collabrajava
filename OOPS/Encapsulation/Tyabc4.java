 impport java.util.scanner;
class Student 
{
	int student_id;
	String name;
	int age;
	double percentage;

	Student()
	{
		
	}

	Student(int student_id)
	{
		this.student_id=student_id;
	}

	Student(int student_id, String name)
	{
		this(student_id);
		this.name=name;
	}

	Student(int student_id, String name,int age)
	{
		this(student_id,name);
		this.age=age;
	}

	Student(int student_id, String name,int age,double percentage)
	{
		this(student_id,name,age);
		this.percentage=percentage;
	}

	public static void edit_name()
	{
		scanner s=new Scanner(System.in);
		System.out.println("Enter a name");
		String n=s.nextLine();
		System.out.println("new name:"+n);

		
	}


	public void display_Attributes()
	{
		System.out.println("sid:"+this.student_id);
		System.out.println("sname:"+this.name);
		System.out.println("age:"+this.age);
		System.out.println("percentage:"+this.percentage);
		System.out.println("================  ");
	}

	public static void main(String[] args) 
	{
		Student s1=new Student();
		Student s2=new Student(01);
		Student s3=new Student(02,"raj");
		Student s4=new Student(03,"som",22);
		Student s5=new Student(05,"tom",25,75.0);
		s1.display_Attributes();
		s2.display_Attributes();
		s3.display_Attributes();
		s4.display_Attributes();
		s5.display_Attributes();
		s1.edit_name();
	}
}
