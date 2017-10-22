import java.util.Scanner;
class  Differ
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter an integer: ");
		int a = sc.nextInt();
		System.out.println("Enter a String: ");
		String b = sc.nextLine();
		System.out.print("interger: "+ a + "\nName: "+ b);
	}
}
