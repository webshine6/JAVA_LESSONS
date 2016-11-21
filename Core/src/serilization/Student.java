package serilization;

import java.io.Serializable;

public class Student implements Serializable {

	private String studName;

	private int studAge;

	private transient Address address;

	private transient int studHeight;

	public Student(String studName, int studAge, Address address, int studHeight) {
		this.studName = studName;
		this.studAge = studAge;
		this.address = address;
		this.studHeight = studHeight;
	}

	public String getStudName() {
		return studName;
	}

	public void setStudName(String studName) {
		this.studName = studName;
	}

	public int getStudAge() {
		return studAge;
	}

	public void setStudAge(int studAge) {
		this.studAge = studAge;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public int getStudHeight() {
		return studHeight;
	}

	public void setStudHeight(int studHeight) {
		this.studHeight = studHeight;
	}

}
