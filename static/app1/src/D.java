class D
{
	
	static int i; // i default value 0
	static int j;// j default value 0.0
	
	/**/
	public static void main(String[] args) 
	{
		System.out.println(i);
		System.out.println(j);
		i =10;// These are not the initializer.i and j got modified.
		j=20;
		System.out.println(i);
		System.out.println(j);
	}
}

/*
o/p:0
	0
	10
	20
*/