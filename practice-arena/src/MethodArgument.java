interface M1
{
	public void manage();
}
class Manager
{
	public void canManage(M1 m)
	{
		m.manage();
	}
}
public class MethodArgument 
{
	
	public static void main(String[] args) 
	{
		Manager m = new Manager();
		m.canManage(new M1()
		{
			public void manage()
			{
				System.out.println("Yes, it is being implemented");	
			}
		});
		
	}
}
