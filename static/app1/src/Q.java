class Q
{
	static int i=10;
	
	public static void main(String[] args) 
	{
		System.out.println(i);// Global variable .Inside s.o.p compiler keeping Q.i
		double i = 2.9;
		System.out.println(i);
		System.out.println(Q.i);
	}
}
