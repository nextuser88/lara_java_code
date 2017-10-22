class A 
{
	public static void main(String[] args) 
	{
		Thread t1 = Thread.currentThread();
		String name = t1.getName();
		long id = t1.getId();
		int priority = t1.getPriority();
		boolean status  = t1.isDaemon();
		System.out.println("name:" +name);
		System.out.println("id:" +id);
		System.out.println("priority:" +priority);
		System.out.println("status:" +status);
	}
}
