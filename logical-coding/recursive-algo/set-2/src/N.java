class N 
{
	static int sum(int[] x, int index)
	{
		if(index == x.length)
		{
			return 0;
		}

		return x[index]+ sum(x, ++index);
	}
	public static void main(String[] args) 
	{
		int[] x ={10,20,5,20,2,6};
		int i = sum(x,0);
		System.out.println(i);
	}
}
