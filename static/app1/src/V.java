class V
{
	static int i = 10;
	static int j = i;
	static int m = n;// forward reference not allowed in java. Usage of global variable inside intializer with forward reference is illegal.
	static int n = j;
	
	public static void main(String[] args) 
	{
		System.out.println(i);		
		System.out.println(j);
		System.out.println(m);
		System.out.println(n);
		
	}
}
/*
CTE: forward refernce is not allowed.
*/