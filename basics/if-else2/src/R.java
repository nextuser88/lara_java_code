class  R
{
	public static void main(String[] args) 
	{
		
		if(test() || test())
		{
		System.out.println("Inside if ");		
		System.out.println("end of if ");
		}
		System.out.println("end of main ");
	}
	static boolean test()
	{
		System.out.println("from test");
	    return false;
	}
}
