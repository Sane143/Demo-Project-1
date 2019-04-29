package com.cilent;

import java.util.Scanner;
import com.student.dao.impl.LoginImpl;
import com.student.dao.impl.UserOption;
import com.student.subcilent.SubCilent;

public class Cilent 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		SubCilent ad=new SubCilent();
		UserOption us=new UserOption();
		Scanner sc=new Scanner(System.in);
		System.out.println("1)ADMIN");
		System.out.println("2)STUDENT");
		System.out.println("3)EXIT");
		System.out.println("Enter your choice");
		int choice=sc.nextInt();
		switch(choice)
		{
		case 1:
			ad.admin();
			break;
		case 2:
			us.user();
			break;
		case 3:
			System.out.println("Thanks for visting");
			System.exit(0);
			break;
		default:
			System.out.println("choose 1 ton 3");
			}
		}
	}
