class K 
{
	static String reverse(String str)
	{
		if((str == null)|| (str.length()<=1))
		{
			return str;
		}
		return reverse(str.substring(1)) + str.charAt(0);
	}
	public static void main(String[] args) 
	{
		String s1 = "hello";
		String s2 = reverse(s1);
		System.out.println(s1 + " reverse "+ s2);
	}
}
