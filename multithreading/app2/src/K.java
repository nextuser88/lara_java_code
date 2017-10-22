class K 
{
	public static void main(String[] args) 
	{
		Runnable r1 = new Runnable()//anonymous inner class subclass to runnable.
		{
			public void run()
			{
				System.out.println("aic-begin");
				System.out.println("aic-end");
			}
		};
		Thread t1 = new Thread(r1);
		t1.start();
		System.out.println("done!");
	}
}
