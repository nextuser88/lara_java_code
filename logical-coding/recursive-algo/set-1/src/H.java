class H 
{
	static int reverse(int i)
	{
		if(i == 0)
		{
			return i;
		}
		return Integer.parseInt(i%10 + "" + reverse(i/10));
		
/* Integer is a wrapper class there is a method called parse Int.
		if string data is 123 then string 123 convert into int(123).
		*/
	}
	public static void main(String[] args) 
	{
		int i = 12345;
		int j = reverse(i)/10;
		System.out.println(j);
	}
}
































