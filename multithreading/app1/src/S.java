class Q extends Thread
{
	public void run()
	{
		System.out.println("Q-begin");
		int i = 10/0;
		System.out.println("Q-end");
	}
}
class R extends Thread
{
	public void run()
	{
		System.out.println("R-begin");
		System.out.println("R-end");
	}
}
class  S
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		Q q1 = new Q();
		q1.start();
		R r1 = new R();
		r1.start();
		System.out.println("main end");
	}
}
