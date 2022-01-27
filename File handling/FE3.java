// Serialization
import java.io.*;
import java.util.*;

public class FE3
{
	public static void main(String[] args)throws Exception
	{
		FileOutputStream n=new FileOutputStream("E:\\javaclass\\sanu12.txt");
		System.out.println("File is successfully created");
		ObjectOutputStream o=new ObjectOutputStream(n);

		Employee e=new Employee(1,"xyz",10000.0);
		System.out.println("Serialization is done");
		o.writeObject(e);
		System.out.println("Successfully stored ");
		o.close();

		FileInputStream f=new FileInputStream("E:\\javaclass\\sanu12.txt");
		ObjectInputStream o1=new ObjectInputStream(f);
		System.out.println(o1.readObject());
		o1.close();
	}
}
class Employee implements Serializable
{
	int eid;
	String name;
	double salary;
	public Employee(int eid, String name,double salary)
	{
		this.eid=eid;
		this.name=name;
		this.salary=salary;
	}
	@Override
	public String toString()
	{
		return "Employee[eid="+eid+",name="+name+",salary="+salary+"]";
	}
}
