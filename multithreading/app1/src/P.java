class O extends Thread
{
	public void run()
	{
		System.out.println("o-started");
		int i = 10/0;
		System.out.println("o-stopped");
	}
}
class  P
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		O o1 = new O();
		o1.start();
		System.out.println("main end");
	}
}
