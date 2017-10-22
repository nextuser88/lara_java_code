class I implements Runnable
{
	public void run()
	{
		
	}
}
class  J
{
	public static void main(String[] args) 
	{
		I obj = new I();
		Thread t1 = new Thread(obj);
		System.out.println(t1.getName());
		t1.setName("hello");
		System.out.println(t1.getName());
	}
}
