class MySkill
{
	public static void main(String[] args) 
	{
		int [] x = {10, 20 ,2,  3, 4, 5, 34, 35, 332, 756, 56, 435, 231, 32, 21};
		int mid = (x.length)/2;
		System.out.println("value of mid: "  + mid);
		if(mid%2 != 0)
		{
			if(x[mid]%2 == 0)
			{
				for(int i = 0; i <= mid; i +=2)
				{	
					System.out.print(x[i]);
					System.out.print("\t");
					
				}
				System.out.println();
				System.out.println("--------------");
				for(int j = ++mid; j < x.length; j +=2)
				{	
					System.out.print(x[j]);
					System.out.print("\t");
				}
			}
			else
			{
				for(int i = 0; i <mid; i +=2)
				{
					System.out.print(x[i]);
					System.out.print("\t");
					
				}
				System.out.println();
				System.out.println("--------------");
				for(int j = mid; j < x.length; j +=2)
				{
					System.out.print(x[j]);
					System.out.print("\t");
				}
			}			
		}
		else
		{
			System.out.println("array is empty..");
		}
		
	}
}
