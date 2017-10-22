class  L
{
	public static void main(String[] args) 
	{
		int i = 0;
		do
		{
			System.out.print("begin");
			if(i++ < 5)
			{
			System.out.println();
			continue;
			}
			System.out.println("end");
		}
		while (i<10);
	}
}
