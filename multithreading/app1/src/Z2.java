class Z2 
{
	public static void main(String[] args) 
	{

		new Thread()
		{
			public void run()
			{
				System.out.println("run begin");
				System.out.println("run end");
			}
		}.start();
		System.out.println("main begin");
		System.out.println("main end");
	}
}
