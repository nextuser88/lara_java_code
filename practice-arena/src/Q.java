public class Q
{
	static int count(int num)
	{
		if(num == 0)
		{
			return 0;
		}
		return isNum2(num%10) + count(num/10);
	}
	static int isNum2(int num)
	{
		return num == 2? 1: 0;
	}
	public static void main(String[] args) 
	{
		int i = 1423232;
		int j = count(i);
		System.out.println("count of 2 is " + j);
	}
}
