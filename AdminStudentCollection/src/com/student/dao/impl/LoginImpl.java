package com.student.dao.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.cilent.Cilent;
import com.student.bean.Student;
import com.student.bean.User;
import com.student.dao.LoginMethods;
public class LoginImpl implements LoginMethods 
{
public static	List<User> addUsers=new ArrayList<User>();
	Scanner sc=new Scanner(System.in);
	StudentDaoImpl vi=new StudentDaoImpl();
	Cilent back=new Cilent ();
	User us=null;
	@Override
	public void Register() 
	{
		// TODO Auto-generated method stub
		System.out.println("Enter your name");
		String uname=sc.next();
		System.out.println("Enter your mobile number");
		int umobile=sc.nextInt();
		System.out.println("Enter user email id");
		String uemail=sc.next();
		System.out.println("Enter username ");
		String uusername=sc.next();
		System.out.println("Enter password");
		String upassword=sc.next();
		us=new User(uname,umobile,uemail,uusername,upassword);
		addUsers.add(us);
		System.out.println("you registerd sucessfully");
		for(User u:addUsers)
		{
			System.out.println(u);
		}
	}
			
	@Override
	public void Update(String username, String password) 
	{
		// TODO Auto-generated method stub
		for(User s:addUsers)
		{
			if(s.getUsername().equals(username) && s.getPassword().equals(password))
			{
				System.out.println("do you want update 1)mobile 2)password");
				System.out.println("Enter your choice");
				int choice=sc.nextInt();
				switch(choice)
				{
				case 1:
					System.out.println("Enter your mobile");
					int umobile=sc.nextInt();
					s.setMobile(umobile);
					System.out.println("mobile number is updated");
					break;
				case 2:
					System.out.println("Enter new password");
					String upassword=sc.next();
					s.setPassword(upassword);
					System.out.println("Your password is updated");
					break;
				default:
					System.out.println("Choose 1 to 2 between");
				}//end of switch
			}//end of if
		}//end of for 
	}
	
}