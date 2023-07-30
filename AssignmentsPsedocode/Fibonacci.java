package AssignmentsPsedocode;

public class Fibonacci 
{
	public static void main(String[] args) 
	{
		//1.initialize firstnum,secondnum and sum and assign 0,1,0.
		int firstNum=0;
		int secnum=1;
		int sum=0;
		//2.print the firstnum
		System.out.println(firstNum);
		//3.iterate the values from zero till 10 
		for (int i = 0; i <=10; i++)
		{
			//4.add firstnum and secondnum and assign to sum
			//5.assign firstnum to secondnum
			//6.assign secondnum to sum
			sum=firstNum+secnum;
			firstNum=secnum;
			secnum=sum;
			//7.print the sum
			System.out.println(sum);	
		}
		
	}

}
