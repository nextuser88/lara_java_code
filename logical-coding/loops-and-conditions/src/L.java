class L
{
	public static void main(String [] args)
	{
		int i = 0;
		int j = 2;
		boolean flag = true;
		int sum =0;
		while(i<=5)
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
				sum+=j;
				i++;
			}
			else
			{
				flag = true;

			}
			j++;
		}

		System.out.println("sum:" + sum);
		
	}

}