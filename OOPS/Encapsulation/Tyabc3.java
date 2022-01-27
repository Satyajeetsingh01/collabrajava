class Student 
{
	int sid;
	String name;
	int sclass;

	Student()
	{
		
	}

	Student(int sid)
	{
		this.sid=sid;
	}

	Student(int sid,String name)
	{
		this.sid=sid;
		this.name=name;
	}

	Student(int sid,String name,int sclass)
	{
		this.sid=sid;
		this.name=name;
		this.sclass=sclass;
	}
	
}


class Tyabc3
{
	public static void display(Student s)
	{
		System.out.println("sid:"+s.sid);
		System.out.println("sname:"+s.name);
		System.out.println("sclass:"+s.sclass);
		System.out.println("================  ");
	}
	public static void main(String[] args) 
	{
		System.out.println("student details:");
		System.out.println("===============");
		Student s1=new Student();
		s1.sid=001;
		s1.name="sanu";
		s1.sclass=002;
		Student s2=new Student(002);
		Student s3=new Student(003,"rahul");
		Student s4=new Student(004,"raj",006);
		display(s1);
		display(s2);
		display(s3);
		display(s4);
		
	}
}