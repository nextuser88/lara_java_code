class B1
{
	public static void main(String [] args)
	{
		int i =1;
		boolean flag =true;
		int sum=0;

		while(i<=10)
		{
			for(int k =2; k<=(i/2); k++)
			{
				if((i%k) == 0)
				{
					flag = false;
					break;
				}

			}
			if(flag)
			{
				sum += i;
			}
			else
			{
				flag = true;
			}
			i++;
		}
		System.out.println("Sum: "+ sum);
	}

}