/**
 * 
 */
package com.student.dao.impl;

import java.util.List;
import java.util.Scanner;
import com.student.bean.Student;
import com.student.dao.StudentMethods;
import java.util.ArrayList;
public class StudentDaoImpl implements StudentMethods {

	public static List<Student> addRecords=new ArrayList<Student>();
	Scanner sc=new Scanner(System.in);
	Student st=null;
	@Override
	public void addStudentRecords() 
	{
		// TODO Auto-generated method stub
		int n=1;
		while(n==1)
		{
			System.out.println("Enter student no");
			int sno=sc.nextInt();
			System.out.println("Enter student name");
			String sname=sc.next();
			System.out.println("Enter student address");
			String sadd=sc.next();
			st=new Student(sno,sname,sadd);
			addRecords.add(st);
			System.out.println("Student record added");
			System.out.println("Do you want add one more record press 1 or 0");
			n=sc.nextInt();
		}
	}

	@Override
	public List<Student> viewAllRecords() {
		// TODO Auto-generated method stub
		return addRecords;
	}

	@Override
	public Student viewStudent(int sno) {
		// TODO Auto-generated method stub
		Student bean=null;
		for(Student s:addRecords)
		{
			if(s.getSno()==sno)
			{
				bean=s;
				break;
			}
		}
		return bean;
	}

	@Override
	public void updateStudent(int sno) {
		// TODO Auto-generated method stub
		int k=0;
		for(Student s:addRecords)
		{
			if(s.getSno()==sno)
			{
				k++;
				System.out.println("do you want update 1)sname 2)sadd");
				System.out.println("Enter your choice");
				int choice=sc.nextInt();
				switch(choice)
				{
				case 1:
					System.out.println("Enter Student name");
					String sname=sc.next();
					s.setSname(sname);
					System.out.println("Name is updated");
					break;
				case 2:
					System.out.println("Enter student address");
					String sadd=sc.next();
					s.setSadd(sadd);
					System.out.println("Adress is uupdated");
					break;
				default:
					System.out.println("Choose 1 to 2 between");
				}//end of switch
			}//end of if
		}//end of for 
		if(k==0)
			System.out.println("Student does not exit");
	}
	@Override
	public void deleteStudent(int sno) {
		// TODO Auto-generated method stub
		int n=0;
		for(Student s:addRecords)
		{
			if(s.getSno()==sno)
			{
				n++;
				addRecords.remove(s);
				System.out.println("Given no deleted sucessfully");	
			}//end of if
		}//end of for
		if(n==0)
		{
			System.out.println("Student does not exit");
		}
	}

}
