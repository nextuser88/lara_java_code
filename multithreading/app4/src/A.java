class A 
{
	public static void main(String[] args) 
	{
		Thread t1 = new Thread()
		{
			public void run()
			{
				System.out.println("child");
			}
		};
		t1.start();
		System.out.println(t1.isDaemon());
	}
}
