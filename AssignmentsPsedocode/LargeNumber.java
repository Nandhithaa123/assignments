package AssignmentsPsedocode;

public class LargeNumber 
{
	public static void main(String[] args)
	{
		//1.declare the variable as number and assign the values
		int[] number= {33,77,999,22,10,5};
		int max=number[0];
		//2.iterate the loop from 0 till the length of an array
		for (int i = 0; i < number.length; i++) 
		{
			//3.check the condition
				if(number[i]>max)
				{
					max=number[i];
				}
			
		}
		//4.print the value
		System.out.println("largest number in array is "+max);
			}

}
