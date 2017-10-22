class I 
{
	class A implements Runnable
	{
		public void run()
		{
			System.out.println("a begin");
			System.out.println("a end");
		}
	}
	public static void main(String[] args) 
	{
		I obj = new I();
		A a1 = obj.new A();
		Thread t1 = new Thread(a1);
		t1.start();
		System.out.println("main end");
	}
}
