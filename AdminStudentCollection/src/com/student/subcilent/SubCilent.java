package com.student.subcilent;

import java.util.List;
import java.util.Scanner;

import com.cilent.Cilent;
import com.student.bean.Student;
import com.student.dao.impl.StudentDaoImpl;

public class SubCilent 
{
	public void admin() {
	StudentDaoImpl daoImpl=new StudentDaoImpl();
	Cilent back=new Cilent();
	Scanner sc=new Scanner(System.in);
	while(true)
	{
		System.out.println("1)AddStudentRecords");
		System.out.println("2)ViewStudentRecords");
		System.out.println("3)ViewStudent");
		System.out.println("4)UpdateStudent");
		System.out.println("5)DeleteStudent");
		System.out.println("6)Back");
		System.out.println("Enter your choice");
		int choice = sc.nextInt();
		int sno = 0;
		switch (choice) 
		{
		case 1:
			daoImpl.addStudentRecords();
			break;
		case 2:
			System.out.println("SNO\tSNAME\tSADD");
			List<Student> viewRecords = daoImpl.viewAllRecords();
			for (Student st : viewRecords) {
				System.out.println(st);
			}
			break;
		case 3:
			System.out.println("Enter student Number");
			sno = sc.nextInt();
			Student st = daoImpl.viewStudent(sno);
			if (st != null) {
				System.out.println(st);
			} else {
				System.out.println("Student does not exist");
			}
			break;
		case 4:
			System.out.println("Enter student Number");
			sno = sc.nextInt();
			daoImpl.updateStudent(sno);
			break;
		case 5:
			System.out.println("Enter student number");
			sno = sc.nextInt();
			daoImpl.deleteStudent(sno);
			break;
		case 6:
			back.main(null);
			break;
		default:
			System.out.println("Choose 1 to 6 between");
		}// end of switch
	}// end of while
}}
