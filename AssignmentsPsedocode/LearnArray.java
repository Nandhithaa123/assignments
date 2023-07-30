package AssignmentsPsedocode;

public class LearnArray
{
	public static void main(String[] args) 
	{//1.intialize the variable as num as assign 1,2,3,4,5,6 in array
		int[] num= {1,2,3,4,5,6};
		//2.get the array size
		int len =num.length;
		//3.print array size
		System.out.println(len);
		//4.loop through an array from 0 to length of an array
		for(int i=0; i<num.length;i++)
		{
			//5.print the values i
			System.out.println(num[i]);
			
		}//6. print the values 
		System.out.println("ist index " +num[len-1]);
	}
}
