class T extends Thread
{
	T()
	{
		start();//calling start through constructor while object creation.
	}
	public void run()
	{
		System.out.println("T begin");
		System.out.println("T end");
	}
}
class  U
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		T t1 = new T();
		t1.start();//start() is calling second time by main  thread.
		System.out.println("main end");
	}
}
