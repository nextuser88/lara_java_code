class C
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
		t1.setDaemon(true);
		System.out.println(t1.isDaemon());
	}
}
