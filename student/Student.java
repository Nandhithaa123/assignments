package org.student;

import org.department.Department;

public class Student extends Department
{
	public void studentName()
	{
		System.out.println("nandhitha");
	}
	public void studentDept()
	{
		System.out.println("computer science");
	}
	public void studentId()
	{
		System.out.println("20g113");
	}
	public static void main(String[] args) 
	{
		Student stud=new Student();
		stud.collegeName();
		stud.collegeRank();
		stud.deptName();
		stud.studentDept();
		stud.studentName();
		stud.studentId();
		stud.studentName();
		
	}   
}
