class C
{
	public static void main(String[] args) 
	{
		int i =100;
		int j = 0;
		for	(int k = 1;k<=i/2;k++)
		{
			if(i%k == 0)
			{
				j+=k;
				continue;
			}
		}
		if(i==j)
		{
			System.out.println(i +"is perfect no");
		}
		else
		{
			System.out.println(i +" is not perfect no");
			
		}
		

	}
}
