import java.util.Scanner;
class G
{
	public static void main(String[] args) throws ClassNotFoundException
	{
		Scanner sc = new Scanner(System.in);
		System.out.println(1);
		System.out.println("Enter age: ");
		int age = sc.nextInt();
		if(age<=0)
		{
		throw new ArithmeticException();		
		}
		System.out.println(2);
	}
}
