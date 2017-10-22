// comapring the element with average value?

class  X
{
	public static void main(String[] args) 
	{
		int[] x = {80, 81, 82, 79, 78, 88, 86, 84, 91, 60};
		double sum = 0;
		for(int i = 0; i < x.length; i++)
		{
			sum += x[i];
			
		}		
		double avg = sum/x.length;	
		System.out.println(avg);
		for(int i = 0; i < x.length; i++)
		{
			if(x[i] > avg)
			{
				System.out.println("@index " + i + " value(" + x[i] + ") is greater than avg (" + avg + ")"); 
			}
			else
			{
				System.out.println("@index " + i + " value(" + x[i] + ") is less than or equal to avg (" + avg + ")"); 
			}
			
		}
		

	}
}
