class Threads 
{
	public static void main(String[] args) throws InterruptedException
	{
		String name=Thread.currentThread().getName();
		System.out.println("Thread name="+name);
		System.out.println(Thread.currentThread().getId());
		System.out.println(Thread.currentThread().getPriority());
		System.out.println(Thread.currentThread().getState());
		System.out.println(Thread.currentThread().isDaemon());

		for(int i=1;i<=5;i++)
		{
			System.out.println(i);
			Thread.sleep(3000);
		}

	}
}
