package org.system;

public class Desktop extends Computer
{
	public void desktopeSize()
	{
		System.out.println("24*27");
	}
	public static void main(String[] args)
	{
		Desktop desk=new Desktop();
		desk.computerModel();
		desk.desktopeSize();
	}
}
