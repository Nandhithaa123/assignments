package AssignmentsPsedocode;

import java.util.Arrays;

public class SecondLargestNumber 
{
	public static void main(String[] args)
	{
		//1.declare the variable data and assign the values
				int[] data = {3,2,11,4,6,7};

				//2.Arrange the array in ascending order
				Arrays.sort(data);
				System.out.println(Arrays.toString(data));
				//3) Pick the 2nd element from the last and print it
				System.out.println(data[data.length-2]);
				
				
	}


}
