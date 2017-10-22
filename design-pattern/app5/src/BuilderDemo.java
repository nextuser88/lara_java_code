import java.util.Scanner;
public class  BuilderDemo
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Available items in the food court");
		System.out.println("Veg Burger");
		System.out.println("Chicken Burger");
		System.out.println("Coke");
		System.out.println("Pepsi");
		System.out.println("Mention your order for Meal");
		Meal meal = new Meal();
		do
		{
			System.out.println("Your options");
			System.out.println("1 for Veg Burger");
			System.out.println("2 for Chicken Burger");
			System.out.println("3 for Coke");
			System.out.println("4 for Pepsi");	
			int optionId = sc.nextInt();
			if(optionId == 1)
			{
				meal.addItem(new VegBurger());
			}
			else if(optionId == 2)
			{
				meal.addItem(new ChickenBurger());
			}
			else if(optionId == 3)
			{
				meal.addItem(new Coke());
			}
			else if(optionId == 4)
			{
				meal.addItem(new Pepsi());
			}
			else 
			{
				System.out.println("in valid option");
			}

			meal.showItems();
			System.out.println(meal.getCost());
			System.out.println("Do you want to select one more Item?(y/n)");
		}
		while ("y".equals(sc.next()));
		System.out.println("Thanks... visit again");
	}
}
