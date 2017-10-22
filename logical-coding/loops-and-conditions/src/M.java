class M 
{
	public static void main(String[] args) 
	{
		int  i =1;
		int temp1 = i, temp2 =i;
		int digitsCount = 0;
		while(temp1!=0)
		{
			digitsCount++;
			temp1 = temp1/10;
		}
		int digit =0, value=1, sum =0;
		while(temp2!=0)
		{
		value =1;
		digit = temp2%10;
		for(int k=0; k<digitsCount;k++)
			{
				value*=digit;
			}
			sum += value;
			temp2 = temp2/10;
		}
		System.out.println(i+" is Armstrong number: "+(sum ==i));
	}
}
