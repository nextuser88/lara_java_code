class L
{
	static 
	{
		System.out.println("SIB-L:");
	}
		
	public static void main(String args[])
	{
		System.out.println("L-main:" );// 
		
	}

}
class M
{
	static 
	{
		System.out.println("SIB-M:");
	}
		
	public static void main(String args[])
	{
		System.out.println("M-main begin:" );/* 
			L.main(args);/  you can supply null or while using args because they are not using string array any where.In order to execute 
		 L class method. Initially M class is loading into memory while M class calling L class. L is Loading in the memory then 
			 L main method will be executing.*/
		System.out.println("M-main end:" );
	}
		
	
}
