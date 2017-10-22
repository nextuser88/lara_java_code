class M 
{
	public static void main(String[] args) 
	{
		String s = "java is a amazing.";
		char c = 'a';
		int count = s.length() - s.replace("a", "").length();
		System.out.println("count : " + count);
	}
}
