// Serialization
import java.io.*;
import java.util.*;

public class FE3
{
	public static void main(String[] args)throws Exception
	{
		FileOutputStream n=new FileOutputStream("E:\\javaclass\\sanu.txt");
		System.out.println("File is successfully created");
		ObjectOutputStream o=new ObjectOutputStream(n);

		Employee e=new Employee(1,"xyz",10000.0);
		System.out.println("Serialization is done");
		o.writeObject(e);
		System.out.println("Successfully stored ");

		o.close();

		FileInputStream f=new FileInputStream("E:\\javaclass\\sanu.txt");
		ObjectOutputStream o1=new ObjectOutputStream(f);
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
}
