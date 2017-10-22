class  B
{
	static void test(int i)
	{
		try
		{
			if(i == 0)
			{
			return;
			}	
			test(i--);
			System.out.println("Hello to all!");
	
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
		}
		
	}
	public static void main(String[] args) 
	{
		test(3);
	}
}
