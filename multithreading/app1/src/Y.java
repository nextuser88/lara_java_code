class Y 
{
	class A extends Thread
	{
		public void run()
		{
			System.out.println("Y begin");
			System.out.println("Y end");
		}
	}
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		Y y1 = new Y();
		A a1 = y1.new A();
		a1.start();
		System.out.println("main end");
	}
}
