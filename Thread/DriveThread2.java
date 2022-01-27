class Demo1 implements Runnable 
{
	Demo1()
	{

	}
	public void run()
	{
		System.out.println("runnable Thread is executed");

	}
}

class Demo2 extends Thread
{
	Demo2()
	{
		
	}
	public void run()
	{
		System.out.println("Thread Thread is executed");
	}
}

class DriveThread2
{
	public static void main(String[] args) 
	{
		Thread t1=new Thread(new Demo1());
		Demo2 d=new Demo2();
		System.out.println(t1.getName());
		t1.start();

		System.out.println(d.getName());
		d.start();
	}
}
