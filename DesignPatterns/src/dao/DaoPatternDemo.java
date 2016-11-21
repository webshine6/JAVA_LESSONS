package dao;

import java.util.Arrays;

public class DaoPatternDemo {

	public static void main(String[] args) {
		StudentDAO studentDAO = new StudentDaoImpl();
		
		Student ss = studentDAO.getAllStudents().get(0);
		ss.setName("Anton");
		System.out.println("name: " + ss.getName());

		// print all students
//		for(Student student:studentDAO.getAllStudents()) {
//			System.out.println("Student: [RollNo : " + student.getRollNo() + ", Name : " + student.getName() + " ]");
//		}
		
		String[][] arr=new String[2][2];
		arr[0][0] = "rosica";
		arr[0][1] = "elena";
		arr[1][0] = "petur";
		arr[1][1] = "lara";
	
		System.out.println(Arrays.deepToString(arr));
		
	}

}
