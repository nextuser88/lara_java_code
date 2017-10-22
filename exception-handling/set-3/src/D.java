class  D
{
	public static void main(String[] args)
	{
		System.out.println(1);
		if(true)
		{
			throw new NumberFormatException("some message");
		}
		System.out.println(2);
	}
	
	
}
