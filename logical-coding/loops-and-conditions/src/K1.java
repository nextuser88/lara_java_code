class K1 
{
	public static void main(String[] args) 
	{
		int i =0;
		int j= 2;
		boolean flag = true;
		while(i<=100)
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
				i++;
			}
			else
			{
			flag = true;
			}
			j++;
		}
		
	}
}
