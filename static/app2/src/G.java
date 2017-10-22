class G
{

	static 
	{
	
		System.out.println(i);// usage of global variable in the initialzer with forward references. Inside initialzer i is using.
		
	}
	static int i;

	public static void main(String [] args)
	{
		System.out.println("done");
	}
	
}