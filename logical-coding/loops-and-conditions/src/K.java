class K
{
	public static void main(String [] args)
	{
		//int i = 0;
		int j = 2;
		boolean flag = true;
		
		while(j<=1000)
		{
			for(int k =2; k<=(j/2);k++)
			{
				if(j%k == 0)
				{
				flag = false;
				break;
				}
			}
			if(flag)
			{
				System.out.print(j+ ",");
			}
			else
			{
				flag = true;

			}
			j++;
		}
		
	}

}