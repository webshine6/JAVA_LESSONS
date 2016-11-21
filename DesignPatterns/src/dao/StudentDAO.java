package dao;

import java.util.List;

public interface StudentDAO {

	public List<Student> getAllStudents();
	
	public Student getStudent(int rollNum);
	
	public void updateStudent(Student student);
	
	public void deleteStudent(Student student);
	
}