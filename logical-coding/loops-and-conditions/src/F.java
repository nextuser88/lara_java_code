class F 
{
	public static void main(String[] args) 
	{
		int i = 0;
		int j = 1;
		int k = 0;
		int sum =i+j;
		for (int m =3; m<=98;m++)
		{
			k = i+j;
			sum += k;
			i=j;
			j=k;
			
		}
		System.out.println("the total sum :"+ sum);
		
	}
}
