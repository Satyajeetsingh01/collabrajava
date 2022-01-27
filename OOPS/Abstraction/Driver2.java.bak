//ola program

import java.util.Scanner;
abstract class Ola 
{
	String customername;
	long contact_no;

	abstract public void bookRide();
}

class Auto extends Ola
{

	double cost=15;
	
	public void bookRide()
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the source location");
		String source=s.nextLine();
		System.out.println("Enter the destination location");
		String destination=s.nextLine();
		System.out.println("Enter the departure time");
		String time=s.nextLine();
		System.out.println("Enter the distance in km");
		double distance=s.nextDouble();
		System.out.println();
		System.out.println("==========================================");

		System.out.println("The auto ride has been booked successfully and will arrive at"+time+"!!");
		double amount=(cost*distance);
		amount=amount*1.1;
		System.out.println("your ride from"+source+"to"+destination+"will cost rs"+amount);

		System.out.println();
		System.out.println("Dear "+customername+" your contact no is "+contact_no+" thank you for using ola application");
		System.out.println("THE COST BREAKDOWN IS");
		System.out.println("RS. "+(cost*distance)+" 5% SGST OF RS. "+amount*0.05+" 5% CGST OF RS. "+amount*0.05);

		System.out.println("==========================================");

	}
}

class mini extends Ola
{
	double cost=17;
	
	public void bookRide()
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the source location");
		String source=s.nextLine();
		System.out.println("Enter the destination location");
		String destination=s.nextLine();
		System.out.println("Enter the departure time");
		String time=s.nextLine();
		System.out.println("Enter the distance in km");
		double distance=s.nextDouble();
		System.out.println();
		System.out.println("==========================================");

		System.out.println("The auto ride has been booked successfully and will arrive at"+time+"!!");
		double amount=(cost*distance);
		amount=amount*1.1;
		System.out.println("your ride from"+source+"to"+destination+"will cost rs"+amount);

		System.out.println();
		System.out.println("Dear "+customername+" your contact no is "+contact_no+" thank you for using ola application");
		System.out.println("THE COST BREAKDOWN IS");
		System.out.println("RS. "+(cost*distance)+" 5% SGST OF RS. "+amount*0.05+" 5% CGST OF RS. "+amount*0.05);

		System.out.println("==========================================");
	}
}

class prime extends Ola
{
	double cost=20;
	
	public void bookRide()
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the source location");
		String source=s.nextLine();
		System.out.println("Enter the destination location");
		String destination=s.nextLine();
		System.out.println("Enter the departure time");
		String time=s.nextLine();
		System.out.println("Enter the distance in km");
		double distance=s.nextDouble();
		System.out.println();
		System.out.println("==========================================");

		System.out.println("The auto ride has been booked successfully and will arrive at"+time+"!!");
		double amount=(cost*distance);
		amount=amount*1.1;
		System.out.println("your ride from"+source+"to"+destination+"will cost rs"+amount);

		System.out.println();
		System.out.println("Dear "+customername+" your contact no is "+contact_no+" thank you for using ola application");
		System.out.println("THE COST BREAKDOWN IS");
		System.out.println("RS. "+(cost*distance)+" 5% SGST OF RS. "+amount*0.05+" 5% CGST OF RS. "+amount*0.05);

		System.out.println("==========================================");
	}
}

class Driver3
{
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		Ola ola;
		System.out.println();
		System.out.println("==========welcome to ola===========");

		while(true)
		{
			System.out.println();
			System.out.println("1. Auto");
			System.out.println("2.mini");
			System.out.println("3.prime");
			System.out.println("4.exit");
			System.out.println();
			System.out.println("Enter your choice");
			int choice=s.nextInt();
			System.out.println("=======================================");

			if(choice==4)
			{
				break;
			}

			switch(choice)
			{
				case 1:
				{
					ola=new Auto();
					System.out.println("Enter your name");
					ola.customername=s.nextLine();
					ola.customername=s.nextLine();

					System.out.println("Enter your contact_no");
					ola.contact_no=s.nextLong();

					ola.bookRide();
				}
				break;

				case 2:
				{
					ola=new mini();
					System.out.println("Enter your name");
					ola.customername=s.nextLine();
					ola.customername=s.nextLine();


					System.out.println("Enter your contact_no");
					ola.contact_no=s.nextLong();

					ola.bookRide();
				}
				break;

				case 3:
				{
					ola=new prime();
					System.out.println("Enter your name");
					ola.customername=s.nextLine();ola.customername=s.nextLine();


					System.out.println("Enter your contact_no");
					ola.contact_no=s.nextLong();

					ola.bookRide();
				}
				break;

				default:
				{
					System.out.println("invalid choice");
				}

			}
		}

		System.out.println();
	    System.out.println("THANK YOU FOR BOOKING A RIDE WITH US");

	}
}