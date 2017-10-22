class  Z
{
	public static void main(String[] args) 
	{
		int i =0;
		while(i<10)
		{
			i++;
			System.out.print("begin");
			if(i <5)
			{
				System.out.println();
				continue;
			}
			System.out.println("end");
		}
	}
}