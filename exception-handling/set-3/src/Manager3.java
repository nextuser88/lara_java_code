import java.io.Closeable;
import java.io.IOException;

class A implements Closeable 
{
	public void close() throws IOException
	{
		System.out.println("closed");
	}
	public void use() 
	{
		System.out.println("used");
	}
	
}
public class Manager3
{
	
	public static void main(String[] args) 
	{
		try(A a1 = new A(); A a2 = new A())
		{
			System.out.println(1);
			a1.use();
			System.out.println(2);
		}
		catch (IOException ex)
		{
			System.out.println(3+ ":" + ex);
		}
		finally
		{
			System.out.println(4);
		}
		System.out.println(5);
	}
}