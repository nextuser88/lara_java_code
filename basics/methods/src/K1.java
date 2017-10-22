class  K1
{
	static int test(int i)
	{
		//int i = 0;
		return ++i;
	}
	public static void main(String[] args) 
	{
		//System.out.println(test(9));
		int i =0;
		System.out.println(test(i++));
		System.out.println(i);
			i = 0;
		System.out.println(test(i--));
		//System.out.println(i);
		//i = test(i++);
		System.out.println(i);
	}
}
