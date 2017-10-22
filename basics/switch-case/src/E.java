class E
{
	public static void main(String[] args) 
	{
		int i = 1;
		switch(i)
		{
			case 1: 
			case 3:				
			case 5: 
				
			case 7: 
			case 9:
				System.out.println("odd number.");
				break;
			case 2:
			case 4:
			case 6:
			case 8:
			case 10:
				System.out.println("even number.");
		}
		System.out.println("end of main.");
	}
}