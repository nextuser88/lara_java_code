class G
{
	public static void main(String args[])
	{
		int i =2;
		boolean flag = true;
		while(i<1000)
		{
			for(int k =2; k<=(i/2); k++)
			{
				if(i%k == 0)
				{
					flag = false;
					break;
				}

			}

				if(flag)
				{
					System.out.print(i+",");
					
				}
				else
				{
					flag = true;
				}
				
				
			i++;
			
			
		}
	}
}