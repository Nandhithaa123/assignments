package AssignmentsPsedocode;

import java.util.Arrays;

public class DescendingOrder
{
	public static void main(String[] args)
	{
		//1.initialize the variable num and assign the values
		int[] num= {10,20,30,40,50};
		int len=num.length;
		//2.print length of an array
		System.out.println(len); 
		//3.loop through the array from 0 till length of an array
		for(int i=0;i>num.length;i++)
		{
			//4.print i
			System.out.println(num[i]);
		}
		System.out.println();
		//5.sort the array
		Arrays.sort(num);
		//loop through the array from length of an array till 0 by decrementing the values
		for(int i=num.length-1;i>=0;i--)
		{
			//6.print i
			System.out.println(num[i]);
		}
		
		
	}


}
