package AssignmentsPsedocode;

import java.util.Arrays;

public class MissingElementInAnArray
{
	public static void main(String[] args) {
		// Declare an array num and assign the values
		int[] arr = {1,2,3,4,7,6,8};
		// Sort the array	
		Arrays.sort(arr);
        //Convert the array into string and print it
        System.out.println(Arrays.toString(arr));
        //iterate a for loop from 0 to the length of the array
        for (int i = 0; i < arr.length; i++) {
        	//declare a variable j and assign the value as i+1
        	int j=i+1;
        	//if the element of the array is not equal to the variable j,then print the value of variable j
			if(arr[i]!=j) {
				System.out.println(j);
				// break the loop if the condition gets satisfied
				break;
			}
				
		}
	}

}
