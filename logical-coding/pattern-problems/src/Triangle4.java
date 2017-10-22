class  Triangle4
{
	public static void main(String[] args) 
	{
		/*
		char c1 = 'a';
		int i = c1;//ASCII CODE retreiving into i.
		i++;//inrementing ascii code.
		char c2 = (char)i;//asigning to char .
		System.out.println(c2);*/
		int rows = 5;
		
		for(int i =1; i<= rows; i++)
		{
			char c1 = 'a';
			int value = c1;

			for(int j =1; j<=i; j++)
			{
				System.out.print((char)(value++));
			}
			System.out.println();
		}
	}
}
