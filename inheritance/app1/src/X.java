class X
{	
}
class Y extends X
{
	Y(int i)
	{
		//super(10);
		System.out.println("Y(int)");
	}
	public static void main(String[] args) 
	{
		Y y1 = new Y(10);
		System.out.println("------");
		
		
	}
}
