import java.util.Scanner;

public class I
{

public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println(1);
		System.out.println("enter age: ");
		int age = sc.nextInt();
		if(age<=0)
		{
			throw new AgeisNegativeException("age should be +ve");
		}
		System.out.println(2);
	}
}