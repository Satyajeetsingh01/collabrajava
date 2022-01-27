import java.util.Scanner;
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

	public void edit_name()
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a name");
		name=s.nextLine();
		System.out.println("new name is :"+name);	
	}


	public void display_Attributes()
	{
		System.out.println("student_id:"+student_id);
		System.out.println("sname:"+name);
		System.out.println("age:"+age);
		System.out.println("percentage:"+percentage);
		System.out.println("================  ");
	}

	public static void main(String[] args) 
	{
		Student s1=new Student();
		Student s2=new Student(02);
		Student s3=new Student(03,"raj");
		Student s4=new Student(04,"som",22);
		Student s5=new Student(05,"tom",25,75.0);
		s1.display_Attributes();
		s2.display_Attributes();
		s3.display_Attributes();
		s4.display_Attributes();
		s5.display_Attributes();
		s4.edit_name();
		s4.display_Attributes();
	}
}
