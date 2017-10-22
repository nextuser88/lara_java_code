class I1 
{
	public static void main(String[] args) 
	{
		int i =11;
		boolean flag =true;
		for(int k =2;k<=i/2;k++)
		{
			if(i%k == 0)
			{
				flag = false;
				break;
			}
		}
		System.out.println(i + " is prime "+ flag);
	}
}
