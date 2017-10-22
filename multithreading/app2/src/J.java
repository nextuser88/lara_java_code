class J 
{
	public static void main(String[] args) 
	{
		class A implements Runnable
		{
			public void run()
			{
				System.out.println("a begin");						
				System.out.println("a end");						
			}
		}
		Thread t1 = new Thread(new A());
		t1.start();
		System.out.println("done");
	}
}
