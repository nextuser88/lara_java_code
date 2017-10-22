class M 
{
	public static void main(String[] args) 
	{
		Thread t1 = Thread.currentThread();
		System.out.println(t1.getName());
		t1.setName("hello");
		System.out.println(t1.getName());
	}
}
