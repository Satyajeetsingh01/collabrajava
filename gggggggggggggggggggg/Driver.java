//ASSIGNMENT 1
import java.util.Scanner;
class channel 
{
	String name;
	int price;

	cahnnel(String name,int price)
	{
		this.name=name;
		this.price=price;
	}
}

class Regionalpack
{
	String name;
	int price;

	Regionalpack(String name,int price)
	{
		this.name=name;
		this.price=price;
	}
}

class Tatasky
{
	String name;
	long contact_no;
	String dob;
	String gender;
	String emailid;
	String tataskyid;
	long balance;

	void modifyPack()
	{
		Scanner s=new Scanner(System.in);
		System.out.println("1.ADD CHANNEL");
		System.out.println("2.ADD REGIONAL PACK");
		System.out.println("3.REMOVE PACK");
		System.out.println("4.REMOVE REGIONAL PACK");
		System.out.println("5.Enter your choice");
		int ch1=s.nextInt();
		switch(ch1)
		{
			case 1:
			{
				System.out.println("CHANNELS ARE");
				System.out.println("1.ZEE TV");
				System.out.println("2.STAR PLUS");
				System.out.println(".STAR GOLD");
				System.out.println("4.CNN");
				System.out.println("5.WBC");
				System.out.println("enter your choice");
				int ch2=s.nextInt();

			}
		}

	}
}


