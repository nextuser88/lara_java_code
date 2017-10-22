class V extends Thread
{
	public void run()
	{
		System.out.println("v started");
		start();
		System.out.println("v stopped");
	}
}

class  W
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		V v1 = new V();
		v1.start();
		System.out.println("main end");
	}
}
