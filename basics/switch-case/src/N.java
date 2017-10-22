class N
{
	public static void main(String[] args) 
	{
		byte i = 6;
		
		switch(i)
		{
			case -128: 
				System.out.println("-128");
						
			case 127:
				System.out.println("127");

			default:
				System.out.println("other than -128 and 127");

					
		}
		System.out.println("end of main.");
	}
}