package AssignmentsPsedocode;

public class Factorial 
{
		public static void main(String[] args) 
		{
			//1.initialize the variable as fact and assign as 1
			int fact=1;
			//2.iterate the values from 5 and decrement the values
			for(int i=5;i>0;i--)
			{
				fact=fact*i;
				
			}
			//3.print the numbers
			System.out.println(fact);
		}
}
