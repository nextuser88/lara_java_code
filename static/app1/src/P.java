class P
{
	static int i;
	
	public static void main(String[] args) 
	{
		System.out.println(i);/*compiler provide a P.i inside a class file. While compiling compiler provide a class Name to all global member
                                inside the class file. It is advisable to use className with variable to avoid confusion.*/
		i = 10;
		System.out.println(P.i);
	}
}
