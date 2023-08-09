package Assignment3;
import Assignment3.BankInfo;

public class AxisBank extends BankInfo 
{
	public void deposit()
	{
		System.out.println("axis bank deposit");
	}
	public static void main(String[] args) 
	{
		AxisBank axis=new AxisBank();
		axis.deposit();
		axis.fixed();
		axis.saving();
		axis.deposit();
		
	}
	

}
