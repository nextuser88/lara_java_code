class  N
{
	public static void main(String[] args) 
	{
		Thread t1 = Thread.currentThread();
		System.out.println("a:" + t1.getPriority());
		t1.setPriority(10);
		System.out.println("b:" + t1.getPriority());
	}
}
