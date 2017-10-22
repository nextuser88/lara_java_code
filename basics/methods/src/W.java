class  W
{
  static int test1(int i) 
	{
		
		return ++i ;	
	}
  static int test2(int i) 
	{
		
		return i-- ;	
	}
  static int test3(int i) 
	{
		
		return ++i + i++ ;	
	}
	public static  void main(String[] args) 
	{				
		//System.out.println(test(9));
		int i = 0;
		System.out.println(test1(i++));	
		System.out.println(test2(i++));	
		System.out.println(test3(i++));	
		System.out.println(i);	
		i = 0;
		System.out.println(test3(i--));	
		System.out.println(test2(i--));	
		System.out.println(test1(i--));	
		System.out.println(i);	
		
	}
}
