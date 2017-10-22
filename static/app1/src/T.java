class T
{
	static int i=10;//i got declared
	static int j=20;// j got declared
	static int k= i+j;//In the initializer of k declared variables are allowed to use.
	
	public static void main(String[] args) 
	{
		System.out.println(i);		
		System.out.println(j);
		System.out.println(k);
		
	}
}
