class K extends Thread
{
	public void run()
	{
		for(int i = 0; i < 1000; i++)
		{
			System.out.println("from k: " + i);
		}
	}
}
class  L
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		K k1 = new K();
		//k1.run();
		k1.start();
		System.out.println("main end");
	}
}
