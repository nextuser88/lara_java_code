class R
{
	public static void main(String[] args)
	{
		outer:
		for(int i = 0; i<5; i++)
		{
			//System.out.println("outer for-loop");
		for(int j =0; j<5; j++)
			{
				//System.out.println("inner for-loop");
				if(j>2)
				{
					
					break outer;
				}
				System.out.println(i+","+j);
			}
		}
	}
}