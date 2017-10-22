class N
{
	static int i=10;

	
	static 
	{

		System.out.println("N- sib");
	}
		
	
}
class O
{
	static 
	{
		System.out.println("O-SIB:");
	}
		
	public static void main(String args[])
	{
		System.out.println("O-main begin:" );// 
		System.out.println(N.i);//first time class N will be loading.
		System.out.println(N.i);//already  N class loaded. Once class loading into the memory it will be keep using same class again and again.
		System.out.println(N.i);//N will not be loading. As long as execution is going on same class will be using.
		System.out.println("M-main end:" );
	}
		
	
}
