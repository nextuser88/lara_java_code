class A 
{
	/* i is not declared in main method. i is global variable. i is a property of class and atrribute of the class and field of the
	class. This i can be without static also.Every global var automatically initialize with defalut value.
	While running A class you will be getting default value 0.*/

	static int i;

	public static void main(String[] args) 
	{
		System.out.println(i);
	}
}
