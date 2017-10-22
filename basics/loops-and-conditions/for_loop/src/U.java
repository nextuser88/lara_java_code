class U
{
	public static void main(String[] args) 
	{
		for(int i =0; i<10; i++)
		{
			System.out.println("done");
			if(i<5)
			{
			  System.out.println();
			  continue;
			}
		}
		System.out.println("end");
	}
}