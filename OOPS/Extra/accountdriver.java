class Account
{
	private String account_holder_name;
	private long account_number;
	private long balance;


	Account(String account_holder_name, long account_number, long balance)
	{
		this.account_holder_name=account_holder_name;
		this.account_number=account_number;
		this.balance=balance;
	}

	public String getaccount_holder_name()
	{
		return account_holder_name;
	}

	public void setaccount_holder_name(String account_holder_name)
	{
		this.account_holder_name=account_holder_name;
	}


	public long getaccount_number()
	{
		return account_number;
	}


	public long getbalance()
	{
		return balance;
	}

	public void setbalance(long balance)
	{
		this.balance=balance;
	}

	public void accountDetails() 
	{
		System.out.println("account_holder_name:"+account_holder_name);
		System.out.println("account_number:"+account_number);
		System.out.println("balance:"+balance);
	}
}

class accountdriver
{
	public static void main(String[] args)
	{
		System.out.println("before");
		Account a1=new Account("sanu",51200201000l,100000000l);
		a1.accountDetails();
		System.out.println("---------------------------");

		System.out.println("after");
		a1.setaccount_holder_name("TTTTTTTT");
		a1.setbalance(9999999999l);
		a1.accountDetails();
	}
}
