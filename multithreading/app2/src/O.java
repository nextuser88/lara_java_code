class O 
{
	static Runnable getRunnable()//static getRunnable method.
	{
		Runnable r1 = new Runnable()
		{
			public void run()
			{
				System.out.println("child-begin");
				System.out.println("child-end");
			}
		};
		
		return r1;
	}
	public static void main(String[] args) 
	{
		Runnable obj = getRunnable();
		Thread t1 = new Thread(obj);
		t1.start();
		System.out.println("done!");
	}
}
