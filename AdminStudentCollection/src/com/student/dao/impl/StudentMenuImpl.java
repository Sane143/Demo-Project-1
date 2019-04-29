package com.student.dao.impl;

import java.util.List;
import java.util.Scanner;

import com.cilent.Cilent;
import com.student.bean.Student;
import com.student.bean.User;

public class StudentMenuImpl 
{
	public void studentMenu(String usern,String password)
	{
		StudentDaoImpl vi=new StudentDaoImpl();
		LoginImpl lm=new LoginImpl();
		Cilent back=new Cilent();
		Scanner sc=new Scanner(System.in);
		int k=0;
		for(User pr:lm.addUsers)
		{
			if(pr.getUsername().equals(usern) && pr.getPassword().equals(password))
			{
				while(true) {
				k++;
				System.out.println("1)view students");
				System.out.println("2)Edit");
				System.out.println("3)Back");
				System.out.println("Enter your choice");
				int choice=sc.nextInt();
				switch(choice)
				{
				case 1:
					System.out.println("SNO\tSNAME\tSADD");
					List<Student> viewRecords =vi.viewAllRecords();
					for (Student st : viewRecords) 
					{
						System.out.println(st);
					}
					break;
				case 2:
					lm.Update(usern,password) ;
					break;
				case 3:
					back.main(null);
					break;
				default:
					System.out.println("Choose 1 to 3");
				}//end of switch
				}//end of while
			}//end of if
				
		}//end of for
		if(k==0)
		{
			System.out.println("Please register first");
		}
	}
}
