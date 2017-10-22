class M  
{
	public static void main(String[] args) 
	{
		new Thread(new Runnable()
		{
			public void run()
			{
				System.out.println("aic-begin");
				System.out.println("aic-end");
			}
		}).start();
		System.out.println("done!");
	}
}
