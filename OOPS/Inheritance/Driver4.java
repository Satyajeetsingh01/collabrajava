//session 16 activity aggregation//
class Account 
{
	private String account_holder_name;
	private long account_no;
	private double bal;

	public String getaccount_holder_name()
	{
		return account_holder_name;
	}

	public void setaccount_holder_name(String account_holder_name)
	{
		this.account_holder_name=account_holder_name;
	}

	public long getaccount_no()
	{
		return account_no;
	}

	public double getbal()
	{
		System.out.println("new bal is ");
		return bal;
	}

	public void setbal(double bal)
	{
		this.bal=bal;
	}

	public void accountDetails()
	{
		System.out.println("account_holder_name:"+account_holder_name);
		System.out.println("account_no:"+account_no);
		System.out.println("balance:"+bal);
	}

	Account()
	{
		
	}

	Account(String account_holder_name,long account_no,double bal)
	{
		this.account_holder_name=account_holder_name;
		this.account_no=account_no;
		this.bal=bal;
	}
}

class Branch
{
	private String manager_name;
	private String ifsc;

	Account a;

	public String getmanager_name()
	{
		return manager_name;
	}
	public void setmanager_name(String manager_name)
	{
		this.manager_name=manager_name;
	}

	public String getifsc()
	{
		return ifsc;
	}

	public void createAccount(Account a)
	{
		this.a=a;
		System.out.println("account is created");
	}

	public void branchAttribute()
	{
		System.out.println("manager name: "+manager_name);
		System.out.println("ifsc code: "+ifsc);
	}
	Branch()
	{
		
	}

	Branch(String manager_name,String ifsc)
	{
		this.manager_name=manager_name;
		this.ifsc=ifsc;
	}
}

class Driver4
{
	public static void main(String[] args)
	{
		Branch b=new Branch("BOOHSBS","UBINO551201");
		b.createAccount(new Account("Satyajeet",51200000l,10000000.0));
		System.out.println("======before========");
		b.a.accountDetails();
		b.branchAttribute();

		System.out.println("======after========");
		b.a.setbal(200000.0);
		System.out.println(b.a.getbal());

	}
}
