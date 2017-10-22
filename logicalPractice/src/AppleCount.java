public class AppleCount
{
public int countApple(String str,String test)
{
	int count = 0;
	for (int i = 0; i < str.length()-4; i++)
	{
		if (str.substring(i,i+5).equals(test))
		{
			count ++;
		}
	}
	return count;
}
public static void main(String[] args) 
{
	AppleCount ac = new AppleCount();
	System.out.println(ac.countApple("an apple in a dayapple keeps theapple doctor away.apple,apple","apple"));
}
}
