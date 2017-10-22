class  Z5
{
		static int i = test();
		static int test()
		{
			System.out.println("from test");
			main(null);/*we can call main method explicitly. In place of string array we can use null.*/
			return 10;
		}
		/*first storage then initializer from body of test() method main method is called explicitly by the time i value is 0. once initialzer
		has been done main method called by java command. java command executing main method only one time, From body of initializer you 
		can call any main method any no. of time.*/
	public static void main(String[] args) 
	{
		System.out.println("from main");	
		System.out.println(i);	
		
	}
}
