class M extends Thread
{
	public void run()
	{
		for(int i = 0; i < 500; i++)
		{
			System.out.println(i);
		}
	}
}
class  N
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		M m1 = new M();
		//m1.run();
		//m1.run();
		//m1.run();
		m1.start();
		m1.start();
		m1.start();
		System.out.println("main end");
	}
}
