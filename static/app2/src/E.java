class E

{
	static int i=1;
	/*
	i is initialzed with default value 0, then first initializer will be executing i value 1, then second initializer S.I.B will be executing 
	i value 2 then main method is executing i value will be 2.
	*/

	static
	{
		i = 2;
		
	}
	public static void main(String [] args)
	{
		System.out.println(i);
	}
	
}