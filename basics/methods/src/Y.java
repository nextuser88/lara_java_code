class  Y
{
	static int test(int i)
	{
	return i++;
	}
	public static void main(String[] args) 
	{
		//System.out.println("Hello World!");

		int i=0;
		

		i= i++ +i + test(i++) + i;
		
		System.out.println(i);


	}
}
