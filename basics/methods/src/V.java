class  V
{
	static int test1(int i) 
	{
		
		return i++;
	}
	
	public static void main(String[] args) 
	{
		int i = 0;		
		int j = i++ + i + test1(i++) + ++i + test1(i++) + i 
			     + --i + test1(i--) + i + i + test1(i--) + ++i ;
		System.out.println(i);
		System.out.println(j);
		
	}
}