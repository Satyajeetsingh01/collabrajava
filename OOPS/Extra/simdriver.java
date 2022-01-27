class Simcard 
{
	private long number;
	private String service_provider;
	private double local_call_rate;

	Simcard(long number)
	{
		this.number=number;
	}

	Simcard(long number, String service_provider)
	{
		this(number);
		this.service_provider=service_provider;
	}

	Simcard(long number, String service_provider, double local_call_rate)
	{
		this(number,service_provider);
		this.local_call_rate=local_call_rate;
	}

	public long getnumber()
	{
		return number;
	}


	public String getservice_provider()
	{
		return service_provider;
	}

	public void setservice_provider(String service_provider)
	{
		this.service_provider=service_provider;
	}

	public double getlocal_call_rate()
	{
		return local_call_rate;
	}

	public void setlocal_call_rate(double local_call_rate)
	{
		this.local_call_rate=local_call_rate;
	}

	public void printSimDetails() 
	{
		System.out.println("number:"+number);
		System.out.println("service_provider:"+service_provider);
		System.out.println("local_call_rate:"+local_call_rate);
	}
}

class simdriver
{
	public static void main(String[] args)
	{
		System.out.println("before");
		Simcard b1=new Simcard(9905019698l,"idea",10.0);
		b1.printSimDetails();
		System.out.println("---------------------------");

		System.out.println("after");
		b1.setservice_provider("voda");
		b1.setlocal_call_rate(11.0);
		b1.printSimDetails();
	}
}
