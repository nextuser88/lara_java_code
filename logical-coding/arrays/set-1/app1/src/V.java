// How to find out average of first half and second half elements of an int array?
class  V
{
	public static void main(String[] args) 
	{
		int[] x = {1, 20, 3, 60, 20, 10, 15, 23};
		double sum1 = 0;
		double sum2 = 0;
		int mid = x.length/2;
		for(int i = 0; i < mid; i++)
		{
			sum1 += x[i];	
		}		
		double avg1 = sum1/mid;	
		System.out.println("first half: " + avg1);

		for(int i = mid; i < x.length; i++)
		{
			sum2 += x[i];	
		}		
		double avg2 = sum2/mid;	
		System.out.println("Second half: " + avg2);
		

	}
}
