package aggregation;

public class Student {

	public String name;

	public Address studentAddress;

	public Student(String name, Address studentAddress) {
		this.name = name;
		this.studentAddress = studentAddress;
	}

	public static void main(String[] args) {

		Address studentAddress = new Address("Ruse", "Studentska 14");
		Student student = new Student("Snow", studentAddress);
		System.out.println(student.name + " has an address at " + student.studentAddress.city + " city" + " ,street: "
				+ student.studentAddress.street);
	}

}
