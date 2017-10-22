import java.util.Scanner;
class Pattern 
{
	public static void main(String[] args) 
	{
		System.out.println("enter the number: ");
		Scanner sc = new Scanner(System.in);
		Integer num = sc.next();
		
		for (int i = 0; i <num; i++)
		{
			for(int j = i; j < num; j++)
			{
				System.out.print(j);	
			}
		}
		
	}
}
