import java.util.Arrays;
import java.util.Comparator;
class Student 
{
	int id;
	String subject;
	int marks;

	Student(int id,String subject,int marks)
	{
		this.id=id;
		this.subject=subject;
		this.marks=marks;
	}
}

class School 
{
	public static void main(String[] args) 
	{
		Student[] s={new Student(1,"maths",10),new Student(3,"maths",30),new Student(2,"physics",50),new Student(4,"english",40)};
		Arrays.sort(s,new sortByid());

		for(int i=0;i<s.length;i++)
		{
			System.out.println(s[i].id);
	        System.out.println(s[i].subject);
	        System.out.println(s[i].marks);
			System.out.println();

		}
		Arrays.sort(s,new sortBymarks());

		for(int i=0;i<s.length;i++)
		{
			System.out.println(s[i].id);
	        System.out.println(s[i].subject);
	        System.out.println(s[i].marks);
			System.out.println();

		}
		Arrays.sort(s,new sortBysubject());

		for(int i=0;i<s.length;i++)
		{
			System.out.println(s[i].id);
	        System.out.println(s[i].subject);
	        System.out.println(s[i].marks);
			System.out.println();

		}


	}


}



class sortByid implements Comparator
{
	public int compare(Object o,Object o1)
	{
		Student s1=(Student)o;
		Student s2=(Student)o1;
		return s1.id-s2.id;

	}


}
class sortBysubject implements Comparator
{
	public int compare(Object o,Object o1)
	{
		Student s1=(Student)o;
		Student s2=(Student)o1;
		return s1.subject.compareTo(s2.subject);

	}
}
class sortBymarks implements Comparator
{
	public int compare(Object o,Object o1)
	{
		Student s1=(Student)o;
		Student s2=(Student)o1;
		return s1.marks-s2.marks;

	}

}
