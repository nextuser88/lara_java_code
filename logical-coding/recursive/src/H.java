class  H
{
	
	static int reverse(int i)
	{
		if(i == 0)
		{
			return i;
		}	
		
		return Integer.parseInt((i%10)+ "" + reverse(i/10));

	}
	public static void main(String[] args) 
	{
		int i = 12345;
		int j = reverse(i)/10;
		System.out.println(j);
	}
}
