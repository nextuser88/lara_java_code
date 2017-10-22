class U
{
	static int i = j;//i not declared. Inside a initializer whatever global var we are using that global variable should be already declared. 
	static int j = 10;//j is global var. 
	
	public static void main(String[] args) 
	{
		System.out.println(i);		
		System.out.println(j);
		
	}
}
/*o/p: compile time error: usage of global var inside a initialzer with forward reference.
*/