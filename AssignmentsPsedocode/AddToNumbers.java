package AssignmentsPsedocode;

public class AddToNumbers
{
	public static void main(String[] args) 
	{
		//1.input {1,5,4,2,3,0}
		int[] num= {1,5,4,2,3,0};
		//2.iterate the values through array from 0 till length of ana array
		for(int i=0;i<num.length;i++)
		{
			//3.iterate the values from i+1 till length of an array
			for(int j=i+1;j<num.length;j++)
			{
				//4.add i and j and assign to temp
				int temp=num[i]+num[j];
				//5.check the condition
				if(temp==7)
				{
					//5.print the statement if the condition is true
					System.out.println(temp);
				}
			}
		}
		
	}

}
