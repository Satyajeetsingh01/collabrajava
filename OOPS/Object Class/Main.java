//Assignment 5
class Account 
{
	private long acc_no;
	private String ifsc;

	public long getacc_no()
	{
		return acc_no;
	}
	public void setacc_no(long acc_no)
	{
		this.acc_no=acc_no;
	}
	public String getifsc()
	{
		return ifsc;
	}
	public void setifsc(String ifsc)
	{
		this.ifsc=ifsc;
	}
}

class SavingsAccount extends Account
{
	private double balance;

	public double getbalance()
	{
		return balance;
	}
	public void setbalance(double balance)
	{
		this.balance=balance;
	}

	public String toString()
	{
		return "Account no is: "+getacc_no()+"\n"+"Ifsc is :"+getifsc()+"\n"+"balance is"+balance;
	}

	public boolean equals(Object o)
	{
		SavingsAccount s=(SavingsAccount)o;
		if((this.getacc_no()==s.getacc_no())&&(this.getifsc()==s.getifsc())&&(this.balance==balance))
		{
			return true;
		}
		else
		{
			return false;
		}
	}

	public int hashCode()
	{
		return (int)(getacc_no()+balance);
	}
}

class LoanAmount extends Account
{
	private double loan_amount;

	public double getloan_amount()
	{
		return loan_amount;
	}
	public void setloan_amount(double balance)
	{
		loan_amount=balance;
	}

	public String toString()
	{
		return "Account no is: "+getacc_no()+"\n"+"Ifsc is :"+getifsc()+"\n"+"loan amount is"+loan_amount;
	}

	public boolean equals(Object o)
	{
		LoanAmount l=(LoanAmount)o;
		if((this.getacc_no()==l.getacc_no())&&(this.getifsc()==l.getifsc())&&(this.loan_amount==loan_amount))
		{
			return true;
		}
		else
		{
			return false;
		}
	}

	public int hashCode()
	{
		return (int)(getacc_no()+loan_amount);
	}
}

class Main
{
	public static void main(String[] args)
	{
		SavingsAccount s=new SavingsAccount();
		SavingsAccount s1=new SavingsAccount();
		s.setacc_no(555555555l);
		s.setifsc("uujg56");
		s.setbalance(3000);
		s1.setacc_no(555555555l);
		s1.setifsc("uujg56");
		s1.setbalance(3000);
		System.out.println(s1.toString());
		System.out.println(s.hashCode());
		System.out.println(s.equals(s1));


	}
}
