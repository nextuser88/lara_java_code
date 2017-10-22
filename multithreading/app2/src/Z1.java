class Z extends Thread
{
	public void run()
	{
		System.out.println("z-run");
	}
}
class  Z1
{
	public static void main(String[] args) 
	{
		Z obj1 = new Z();
		String name = obj1.getName();
		long id = obj1.getId();
		int priority = obj1.getPriority();
		boolean status = obj1.isDaemon();

		System.out.println("name: "+ name);
		System.out.println("id: "+ id);
		System.out.println("priority: "+ priority);
		System.out.println("status: "+ status);

		Z obj2 = new Z();
		name = obj2.getName();
		id = obj2.getId();
		priority = obj2.getPriority();
		status = obj2.isDaemon();

		System.out.println("name: "+ name);
		System.out.println("id: "+ id);
		System.out.println("priority: "+ priority);
		System.out.println("status: "+ status);

		Z obj3 = new Z();
		name = obj3.getName();
		id = obj3.getId();
		priority = obj3.getPriority();
		status = obj3.isDaemon();

		System.out.println("name: "+ name);
		System.out.println("id: "+ id);
		System.out.println("priority: "+ priority);
		System.out.println("status: "+ status);
	}
}
