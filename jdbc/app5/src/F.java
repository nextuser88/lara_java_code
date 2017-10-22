class F 
{
	public static void main(String[] args) 
	{
		String s1 = "1,abc,hello,xyz";
		String[] s2 = s1.split(",");
		String s3 = s2[0];
		String s4 = s2[1];
		String s5 = s2[2];
		String s6 = s2[3];
		System.out.println(s3);
		System.out.println(s4);
		System.out.println(s5);
		System.out.println(s6);
	}
}
