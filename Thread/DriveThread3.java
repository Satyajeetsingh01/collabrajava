class Demo3 implements Runnable 
{
	Demo3()
	{

	}
	public void run()
	{
		System.out.println("runnable Thread is executing");
		try
		{
			Thread.sleep(3000);
		}
		catch (Exception e)
		{
			System.out.println("Exception is handled");
		}
		System.out.println("runnable Thread is executed");
	}
}

class Demo4 extends Thread
{
	Demo4()
	{
		
	}
	public void run()
	{
		System.out.println("Thread Thread is executing");
		try
		{
			Thread.sleep(3000);
		}
		catch (Exception e)
		{
			System.out.println("Exception is handled");
		}
		System.out.println("Thread Thread is executed");
	}
}

class DriveThread3
{
	public static void main(String[] args) 
	{
		Thread t1=new Thread(new Demo3());
		Demo4 d=new Demo4();

		t1.start();
		d.start();

		System.out.println(t1.getName());
		System.out.println(d.getName());
		
	}
}
