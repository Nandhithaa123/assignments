package AssignmentsPsedocode;

import java.util.Arrays;

public class SortingNumber 
{
	public static void main(String[] args)
	{
		//1.declare the variable as numbers and assign the values
		int[] numbers= {10,5,7,9,8,6};
		//5,6,7,8,9,10
		//2.sort the numbers
		Arrays.sort(numbers);
		//3.convert the arrays into string amd print the values  
		System.out.println(Arrays.toString(numbers));
		//4.iterate the values from 0 till length of an array
		for (int i = 0; i < numbers.length; i++) 
		{
			//5.print numbers i
			System.out.print(numbers[i]+" ");
		}
	}
}
