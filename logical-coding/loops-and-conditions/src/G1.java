class G1 
{
	public static void main(String[] args) 
	{
		int i =1234445;
		int sum =0;
		while(i!=0)
		{
			sum +=i%10;
			i=i/10;
		}
		System.out.println("sum:"+ sum);
	}
}
