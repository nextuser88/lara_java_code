class P
{
	public static void main(String[] args)
	{
		outer:
		for(int i = 0; i<5; i++)
		{
		for(int j =0; j<5; j++)
			{
				//System.out.println("inner-loop begin:");
				if(j>2)
				{
					continue outer;
				}
				System.out.println(i+","+j);
			}
		}
	}
}