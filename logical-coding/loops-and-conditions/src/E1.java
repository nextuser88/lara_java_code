class E1 
{
	public static void main(String[] args) 
	{
		int i = 0;
		int j = 1;
		 int k = 0;
		 System.out.print(i +",");
		 System.out.print(j +",");
		 while(k<=1000)
		{
			 k = i+j;
		System.out.print(k +",");
			i= j;
			j = k;
		}
	}
}
