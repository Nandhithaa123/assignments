package assignment4;

public class Employee 
{

		public void getEmployeeInfo(int id)
		{
			System.out.println("Employee Id: "+id);
		}
		public void getEmployeeInfo(String name) 
		{
			System.out.println("Employee Name: "+name);
		}
		public void getEmployeeInfo(String email,long phone) 
		{
			System.out.println("Employee Email: "+email+" Phone No: "+phone);
		}
		public static void main(String[] args)
		{
			Employee emp=new Employee();
			emp.getEmployeeInfo(1670);
			emp.getEmployeeInfo("");
			emp.getEmployeeInfo("20g113nandhitha@gmail.com", 9987756687L);
		}
	

}
