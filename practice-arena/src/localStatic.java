class localStatic 
{
	public static void main(String[] args) 
	{
		System.out.println(fun());
	}
	static int fun()
	{
		static int x = 10;
		return x--;
	}
}
