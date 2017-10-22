class T extends Thread 
{
	public void run()
	{
		System.out.println("child");
	}
}
class U
{
	public static void main(String[] args) 
	{
		T t1 = new T();
		String name = t1.getName();
		long id = t1.getId();
		int priority = t1.getPriority();
		boolean deamonStatus = t1.isDaemon();
		System.out.println("name: " + name);
		System.out.println("id: " + id);
		System.out.println("priority: " + priority);
		System.out.println("deamonStatus: " + deamonStatus);
		t1.start();
	}
}
