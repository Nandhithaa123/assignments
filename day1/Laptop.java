package week1.day1;

public class Laptop {
	
		public void OpeningLaptop()
		{
			System.out.println("opening laptop");
		}
		public void OnLaptop() 
		{
			System.out.println("on laptop");
		}
		public static void main(String[] args) {
			Laptop mylaptop=new Laptop();
			mylaptop.OpeningLaptop();
			mylaptop.OnLaptop();
		}
}
