package week1.day2;

public class TwoWheeler 
{
		int NoOfWheels=2;	
		Short noofmirrors=2;
		long chassisnumber=451236536l;
		boolean ispunchured=true;	
		String bikename="Yamaha";
		double runningKm=656.76768;
	public static void main(String[] args) 
	{
		TwoWheeler mytwowheeler=new TwoWheeler();
		System.out.println("no of wheels is "+mytwowheeler.NoOfWheels);
		System.out.println("no of mirrors is"+mytwowheeler.noofmirrors);
		System.out.println("chassisnumber"+mytwowheeler.chassisnumber);
		System.out.println("is it punctured?"+mytwowheeler.bikename);
		System.out.println("running km is "+mytwowheeler.runningKm);
	}
}


