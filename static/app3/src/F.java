class F
{
	static int i;	
	public static void main(String args[])
	{
		System.out.println("from main:" +i);// use i straight away.
		System.out.println("from main:" +F.i);//  or use along with file name. 
	}
}

class G
{

	public static void main(String[] args) 
	{
		System.out.println("from main:"+ F.i);
	}
	
}

/*
If 10 classes are there in a java file then 10 class file will be generating.

*/