class  TestA
{
	public static void main(String[] args) 
	{
		int[] x = new int[5];
		x[3] = 25;
		x[0]= 2;
		for(int temp : x)
		{
		System.out.println(temp);
		}
		String[] x = new String[5];
		x[3] = "25";
		x[0]= "2";
		for(String temp : x)
		{
		System.out.println(temp);
		}
		
	}
}
 