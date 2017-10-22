class O extends Thread
{
	public void run()
	{
		System.out.println("O: " + getPriority());
	}
}
class P extends Thread
{
	public void run()
	{
		System.out.println("P: " + getPriority());
	}
}
class Q
{
	public static void main(String[] args) 
	{
		O o1 = new O();
		o1.start();
		
		Thread t1 = Thread.currentThread();
		t1.setPriority(10);
		P p1 = new P();
		p1.start();
	}
}
