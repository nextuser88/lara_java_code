
class O
{
	public static void main(String[] args)
	{
		for(int i = 0; i<5; i++)
		{
		for(int j =0; j<5; j++)
			{
			//System.out.println("Inner for_loop:");
				if(j>2)
				{
					continue;
				}
				System.out.println(i+","+j);
			}
		}
	}
}