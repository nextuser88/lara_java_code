class  Triangle5
{
	public static void main(String[] args) 
	{
		int rows = 5;
		char c1 = 'a';
		int value = c1;
		for(int i =1; i<= rows; i++)
		{
			for(int j =1; j<=i; j++)
			{
				System.out.print((char)(value++));
			}
			System.out.println();
		}
	}
}
