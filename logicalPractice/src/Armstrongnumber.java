import java.util.Scanner;

public class Armstrongnumber
{
public static void main(String[] args)
{
	int r,a,sum = 0,temp;
	
	int number;
	Scanner sc = new Scanner(System.in);
	System.out.println("enter a number");
	 number = sc.nextInt();
	temp = number;
	
	while (number > 0) 
	{
		r = number % 10;
		sum = sum + (r*r*r);
		number = number / 10;
	}
	if (temp == sum)
	{
	System.out.println("armstrong number");	
	}
	else
	{
		System.out.println("not armstrong number");
	}
	}
}

