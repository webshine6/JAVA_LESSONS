package dao;

import java.util.ArrayList;
import java.util.List;

public class StudentDaoImpl implements StudentDAO {

	private ArrayList<Student> listStudents;
	
	public StudentDaoImpl() {
		listStudents = new ArrayList<Student>();
		listStudents.add(new Student("Emiliqn", 1));
		listStudents.add(new Student("Zahari", 2));
	}
	
	
	
	@Override
	public List<Student> getAllStudents() {
		return listStudents;
	}

	@Override
	public Student getStudent(int rollNum) {
		return listStudents.get(rollNum);
	}

	@Override
	public void updateStudent(Student student) {
		listStudents.get(student.getRollNo()).setName(student.getName());
		System.out.println("Student: Roll No " + student.getRollNo() + "updated in DB.");
		
	}

	@Override
	public void deleteStudent(Student student) {
		listStudents.remove(student.getRollNo());
		System.out.println("Student: Roll No " + student.getRollNo() + "deleted in DB.");
		
	}

}
