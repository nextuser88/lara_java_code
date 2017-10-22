class  Z3
{
	
		static int i = test();
		static int test()
		{
			System.out.println("from test");	
			return 10;
		}
		
	
}
/*before loading itself run time error beacuse of no main(). test() method is not initialzed with value 10.
Before that runtime error.*/