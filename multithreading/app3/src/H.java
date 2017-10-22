class G extends Thread
{
	G(String name)
	{
		super(name);
	}
}
class  H
{
	public static void main(String[] args) 
	{
		G g1 = new G("xyz");
		System.out.println(g1.getName());
	}
}
