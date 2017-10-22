class F

{

	static
	{
		i = 1; //we are providing the value to i , we are not using the value of i. No forward reference.
	}
	static int i =2;/* Initially i value  0 is stored, then by the time of Initialization the first static block will be executing and 
				the value of i becomes 1 and then next static block will be executing  and i value will be 2.
				 */
		

	public static void main(String [] args)
	{
		System.out.println(i);
	}
	
}