//package com.lara;
//Selection sort.
import java.util.Arrays;
class  B
{
	public static void main(String a[]) 
	{
		int[] arr = {3, 22, 2, 1, 15, 7, 11, 4, 6, 5};

		System.out.println(Arrays.toString(arr));

		for(int i = 0; i< arr.length; i++)
		{
			int index = i;

			for(int j = i+1; j< arr.length; j++)
			{
				if(arr[j] < arr[index])
				{
					index = j;
				}
			}
			int smallerNumber = arr[index];
			arr[index] = arr[i];
			arr[i] = smallerNumber;
		}
		System.out.println(Arrays.toString(arr));
	}
}
