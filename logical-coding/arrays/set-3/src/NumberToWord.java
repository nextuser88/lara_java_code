public class  NumberToWord
{
	private static String[] specialNames =
	{
		"", "thousand", "million", "billion", "trillion", "quadrillion", "quintrillion"
	};
	private static String[] tensNames =
	{
		"", "ten", "twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty", "ninety"
	};
	private static String[] numNames =
	{
		"", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten" , "eleven", "twelve", "thirteen",
			"fourteen", "fifteen", "sixteen","seveteen", "eighteen", "nineteen"
	};
	private static String convertLessThanOneThousand(int number)
	{
		String current;

		if(number % 100 < 20)
		{
			current = numNames[number % 100];
			number /= 100;
		}
		else
		{
			current = numNames[number % 10];
			number /= 10;
			current = tensNames[number % 10] + current;
			number /= 10;
		}
		if(number == 0)
		{
			return current;
		}
		return numNames[number] + " hundred " + current;
	}

	public static String convert(int number)
	{
		if(number == 0)
		{
			return "zero";
		}
		String prefix = "";

		if(number < 0)
		{
			number = -number;
			prefix = "negative";
		}

		String current = "";
		int place = 0;

		do
		{
			int n = number % 1000;
			if(n != 0)
			{
				String s = convertLessThanOneThousand(n);
				current = s + specialNames[place] + current;
			}
			place++;
			number /= 1000;

		}
		while (number > 0);
		return (prefix + current).trim();
	}
	public static void main(String[] args) 
	{
		/*int i = 123456;
		System.out.println("i = " + i);
		System.out.println("i % 10 =" + (i%10));
		System.out.println("i % 100 =" + (i%100));
		System.out.println("i % 1000 =" + (i%1000));
		System.out.println("i / 10 =" + (i/10));
		System.out.println("i / 100 =" + (i/100));
		System.out.println("i / 1000 =" + (i/1000));*/
		System.out.println(NumberToWord.convert(488567));
		//System.out.println(NumberToWord.convert(-55));
	}
}
