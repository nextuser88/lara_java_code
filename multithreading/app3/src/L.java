class K implements Runnable
{
	public void run()
	{
	}
}
class L  
{
	public static void main(String[] args) 
	{
		K obj = new K();
		Thread t1 = new Thread(obj, "hello");
		System.out.println(t1.getName());
	}
}
