package com.student.dao.impl;

import java.util.Scanner;

import com.cilent.Cilent;

public class UserOption 
{
	Scanner sc=new Scanner(System.in);
	LoginImpl li=new LoginImpl();
	StudentMenuImpl stm=new StudentMenuImpl();
	Cilent back=new Cilent();
	public void user()
	{
		while(true) {
		System.out.println("1)Register");
		System.out.println("2)Login");
		System.out.println("3)Back");
		System.out.println("Enter your choice");
		int uchoice=sc.nextInt();
		switch(uchoice)
		{
		case 1:
			li.Register();
			break;
		case 2:
			System.out.println("Enter user name");
			String un=sc.next();
			System.out.println("Enter Password");
			String ps=sc.next();
			stm.studentMenu(un,ps);
			break;
		case 3:
			back.main(null);
			break;
		default:
			System.out.println("choose 1 to 3");
		}
}
}
}
