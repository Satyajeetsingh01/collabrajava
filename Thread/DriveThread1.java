class Demo8 implements Runnable
{
	Demo8(String s)
	{

	}
	public void run()
	{
		System.out.println("run method is executed");

	}
}

class DriveThread1
{
	public static void main(String[] args) 
	{
		Thread d=new Thread(new Demo8("Thread 0"));
		d.start();
		System.out.println(d.getName());
		System.out.println(d.getId());
		System.out.println(d.getPriority());
		

	}
}
