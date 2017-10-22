class F  
{
	static int test(String str)
	{
		if(str.isEmpty())
		{
			return 0;
		}

		return 1 + test(str.substring(1));
	}
	public static void main(String[] args) 
	{
		int stringLength = test("hello123");
		System.out.println(stringLength);
	}
}
