package com.student.dao;
import java.util.List;
import com.student.bean.Student;
public interface StudentMethods 
{
	void addStudentRecords();
	List<Student> viewAllRecords();
	Student viewStudent(int sno);
	void updateStudent(int sno);
	void deleteStudent(int sno);
}
