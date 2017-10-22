class Q 
{
	static int count(int num)
	{
		if(num == 0)
		{
			return 0;
		}
		return isNum6(num%10) + count(num/10);
	}

	static int isNum6(int i)
	{
		return i == 6 ? 1:0;
	}
	public static void main(String[] args) 
	{
		int i =126666;
		int j = count(i);
		System.out.println(j);
	}
}
