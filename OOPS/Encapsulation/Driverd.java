//Encapsulation example 
import java.util.Scanner;
class Atm 
{
	private long Account_no=12438360l; 
	private double balance=0.0;
	private int password=1243;
	private String Account_holder_name="rama";

	public void addBalance(double balance)
	{
		if ((balance%100==0)||(balance%500==0)||(balance%2000==0))
		{
			this.balance=this.balance+balance;
			System.out.println("amount is successfully added");
		}
			else
		{
			System.out.println("Enter amount which is multiple of 100 or 500 or 2000");
		}	
	}

	public void withdraw(double amount)
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the password");
		int password=s.nextInt();
		if(this.password==password)
		{
			if(amount<balance)
			{
				balance=balance-amount;
				System.out.println("Successfully withdrawn the amount that is "+amount);
			}
			else
			{
				System.out.println("insufficient balance");
			}
		}else
		{

		System.out.println("Password is Incorrect");
		}
	}

	public long getAccount_no()
	{
		return Account_no;
	}

	public void setAccount_holder_name(String name)
	{
		Account_holder_name=name;
	}

	public void displayDetails()
	{
		System.out.println("Account_no is "+Account_no);
		System.out.println("balance" +balance);
		System.out.println("password"+password);
		System.out.println("Account_holder_name "+Account_holder_name);

	}
}

class Driverd
{
	public static void main(String[] args)
	{
		Atm a=new Atm();
		boolean flag=true;
		do
		{
		Scanner s1=new Scanner(System.in);
		System.out.println("=======Menu=======");
		System.out.println("1 Add balance");
		System.out.println("2 Withdraw amount");
		System.out.println("3 Account number");
		System.out.println("4 exit");
		System.out.println("Enter user choice");
		int b=s1.nextInt();
		switch(b)
		{
			case(1):
			{
				System.out.println("Enter amount to be added");
				double d=s1.nextDouble();
				a.addBalance(d);
			}
			break;
			case(2):
			{	System.out.println("Enter the Amount to withdraw!!");
				double v=s1.nextDouble();
				a.withdraw(v);
			}
			break;
			case(3):
			{
				System.out.println(a.getAccount_no());
			}
			break;
			case(4):
			{
				flag=false;
			}
		}
		}
		while(flag);
	}
}

