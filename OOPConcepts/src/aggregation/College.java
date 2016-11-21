package aggregation;

public class College {

	public String name;

	public Address collegeAddress;

	public College(String name, Address coAddress) {
		this.name = name;
		this.collegeAddress = coAddress;
	}

	public static void main(String[] args) {

		Address coAddress = new Address("Varna", "Vladislav Varnenchik");

		College college = new College("UNSS", coAddress);

		System.out.println(college.name + " address is: city" + college.collegeAddress.city + "and street: "
				+ college.collegeAddress.street);
	}

}
