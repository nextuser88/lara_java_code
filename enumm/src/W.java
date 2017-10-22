enum V
{
	c1,c2,c3;

	V()
	{
	System.out.println("V()");
	}
}
class W
{

	public static void main(String[] args) 
	{
		V v1 = V.c3;
		System.out.println(v1);	
		
	}
}
