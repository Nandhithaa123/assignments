package week2.day1;

public class Fibonacci 
{
	public static void main(String[] args) 
	{
		int firstNum=0;
		int secnum=1;
		int sum=0;
		System.out.println(firstNum);
		for (int i = 0; i <=10; i++)
		{
			sum=firstNum+secnum;
			firstNum=secnum;
			secnum=sum;
			System.out.println(sum);	
		}
		
	}

}
