class S
{
	
	public static void main(String[] args) 
	{
		int i = 371;
	int temp1 = i , temp2 = i;
	int digitCount = 0;
	while(temp1 != 0)
	{
		digitCount++;
		temp1 = temp1/10;	
	}
	int digit , sum = 0 , value = 1;
	while(temp2 != 0)
	{
		value = 1;
		digit = temp2 % 10;
		for(int k = 0; k < digitCount; k++)
		{
			value = value*digit;
		}
		sum += value;
		temp2 = temp2/10;
	}
		System.out.println(i+ " is armstrong number " + (sum == i));
	}
}
