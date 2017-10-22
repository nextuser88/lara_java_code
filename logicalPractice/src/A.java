class A 
{
	public static void main(String[] args) 
	{
		String s1 = "ac ck ld led  pp p p p pp p p pp p  p";
		String s2 = s1.replaceAll("\\s", "");
		int countWhiteSpaces = 0;
		System.out.println("without space: " + s2);
		countWhiteSpaces = s1.length()- s2.length();
		System.out.println("space count: " + countWhiteSpaces);
	}
}
