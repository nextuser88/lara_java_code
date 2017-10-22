class  U1
{
	static int test1(int i) 
	{
		
		return i--;
	}
	
	public static void main(String[] args) 
	{
		int i = 0;		
		System.out.println(i);
		i = test1(i--);
		System.out.println(i);
		
	}
}