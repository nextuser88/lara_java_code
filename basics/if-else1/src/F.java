class F
{

	public static void main(String[] args) 
	{
		boolean flag = false;

		int i = 10;

		if(flag = true)
		{
			
		   System.out.println("Inside if: "+ (--i));
		}
		else
		{
		   System.out.println("Inside else:" + i++);
		  
		}

		System.out.println("main end: " + i);
		
	}
}
