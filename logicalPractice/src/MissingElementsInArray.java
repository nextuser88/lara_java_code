public class MissingElementsInArray
{
public static void main(String[] args) 
{
int[] x = {1,10};
int min,max;
min = max = x[0];

for (int i = 0; i < x.length; i++) 
{
		if (x[i] < min)
		{
			min = x[i];
		}
		if (x[i] > max)
		{
			max = x[i];
		}
}

boolean flag = false;

for (int i = min+1; i < max; i++)
{
	for (int j = 0; j < x.length; j++) 
	{
		if (i == x[j])
		{
			flag = true;
			break;
		}
	}
	if (flag)
	{
		flag = true;
	}
	System.out.print(i+",");
}
}
}
