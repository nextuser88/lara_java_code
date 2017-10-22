class H 
{
	static int i;
	static
	{
		i = j;// j is global variable. 
	}
	static int j = 10;
	public static void main(String[] args) 
	{
		System.out.println("done!");
	}
}
