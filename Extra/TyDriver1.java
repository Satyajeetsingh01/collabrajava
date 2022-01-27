class Student 
{
	String name;
	int std_id;
}
	
class TyDriver1
{
	public static void main(String[] args) 
	{
		Student s1=new Student();
		s1.name="Satyajeet Singh";
		s1.std_id=10;
		System.out.println("1st student details");
		System.out.println("name :"+s1.name);
		System.out.println("id :"+s1.std_id);
		System.out.println("=============================");

		Student s2=new Student();
		s2.name="Rakesh Singh";
		s2.std_id=11;
		System.out.println("2nd student details");
		System.out.println("name :"+s2.name);
		System.out.println("id :"+s2.std_id);
	}
}

