class L 
{
	public static void main(String[] args) 
	{
		Thread t1 = new Thread(new Runnable()
		{
			public void run()
			{
				System.out.println("aic-begin");
				System.out.println("aic-end");
			}
		});
		t1.start();
		System.out.println("done");
	}
}
