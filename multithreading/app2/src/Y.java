class V extends Thread 
{
	public void run()
	{
		System.out.println("child1.. V type");
	}
}
class W extends Thread 
{
	public void run()
	{
		System.out.println("child2.. W type");
	}
}
class X extends Thread 
{
	public void run()
	{
		System.out.println("child3.. X type");
	}
}
class Y 
{
	public static void main(String[] args) 
	{
		V v1 = new V();
		String name = v1.getName();
		long id = v1.getId();
		int priority  = v1.getPriority();
		boolean status = v1.isDaemon();
		System.out.println("name:" +name);
		System.out.println("id:" +id);
		System.out.println("priority:" +priority);
		System.out.println("status:" +status);
		System.out.println("-----------");
		W w2 = new W();
		name = w2.getName();
		id = w2.getId();
		priority  = w2.getPriority();
		status = w2.isDaemon();
		System.out.println("name:" +name);
		System.out.println("id:" +id);
		System.out.println("priority:" +priority);
		System.out.println("status:" +status);
		System.out.println("-----------");
		X x3 = new X();
		name = x3.getName();
		id = x3.getId();
		priority  = x3.getPriority();
		status = x3.isDaemon();
		System.out.println("name:" +name);
		System.out.println("id:" +id);
		System.out.println("priority:" +priority);
		System.out.println("status:" +status);
		System.out.println("-----------");
	}
}
