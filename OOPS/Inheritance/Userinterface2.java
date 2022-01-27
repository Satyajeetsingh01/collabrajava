import java.util.Scanner;
class Homepage 
{
	String pickup="Pune";
	String destination="Bangalore";
}

class Auto extends Homepage
{
	double costperkm=50.0;
}

class Mini extends Homepage
{
	double costperkm=30.0;
}

class Prime extends Homepage
{
	double costperkm=20.0;
}

class Ola
{
	int name;
	long cno;

	Homepage h1;

	public void bookRide(Homepage h1)
	{
		this.h1=h1;
	}

	public void cancelRide()
	{
		h1=null;
	}

	public void currentRide()
	{
		if(h1 instanceof Auto)
		{
			Auto a2=(Auto)h1;
			System.out.println("user is riding ola@ speed :"+a2.costperkm);
		}
			else if (h1 instanceof Mini)
		{
			Mini m1=(Mini)h1;
			System.out.println("user is riding mini@ speed :"+m1.costperkm);
		}
			else
		{
			Prime p1=(Prime)h1;
			System.out.println("user is riding prime@ speed :"+p1.costperkm);
		}
		
	}
}

class Userinterface2
{
	public static void main(String args[])
	{
	Scanner s= new Scanner(System.in);
	Ola o1=new Ola();
	boolean flag=true;
	do
	{
		System.out.println("****************************");
		System.out.println("1...BOOK RIDE");
		System.out.println("2...CANCEL RIDE");
		System.out.println("3...CURRENT RIDE");
		System.out.println("4 ...Exit");
		System.out.println("please enter your choice");
		System.out.println("****************************");
		int a=s.nextInt();

		switch(a)
		{
			case 1:
			{
				System.out.println("1...Auto");
				System.out.println("2...Mini");
				System.out.println("3...Prime");
				System.out.println("please enter your choice");
				int b= s.nextInt();

				switch(b)
				{
					case 1:
					{
						o1.bookRide(new Auto());
						System.out.println("Auto is successfully added");
					}
					break;

					case 2:
					{
						o1.bookRide(new Mini());
						System.out.println("Mini is successfully added");
					}
					break;

					case 3:
					{
					    o1.bookRide(new Prime());
					    System.out.println("Prime is successfully added");
					}
				}
			}
			break;

			case 2:
			{
				o1.cancelRide();
				System.out.println("Ride is cancelled");
			}
			break;

			case 3:
			{
				o1.currentRide();
			}
			break;

			case 4:
			{
				flag=false;
			}
		}
	}
	while (flag);
	}	
}

