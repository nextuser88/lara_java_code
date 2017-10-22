/*
	A AND B are both non public class. If any java file containing non public classes then file name can be any name.
	If A is public file could be saved A.java or if class B is public file could be B.java even new name also.
	In one java file more than one class can't be public. Only one class can be public. In one java file any no. of
	classes can be deceloped. If any class is non public then you can choose file name as any name. While using 
	one class  static member into another class you have to use along with class Name.
	While comiling this file compiler generates A.class for class A and B.class for class B. 
	A class doesn't containg main method so we can't run class A . B class containing main method we can run class B only.
*/

class A
{
	
	static int i=10;

	
}

class B
{

	public static void main(String[] args) 
	{
		System.out.println(A.i);
	}
	
}
