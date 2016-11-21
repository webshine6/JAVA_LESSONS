package serilization;

import java.io.Serializable;

public class Employee implements Serializable {

	public String name;

	public String family;

	public String address;

	public int ssl;

	public int number;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getSsl() {
		return ssl;
	}

	public void setSsl(int ssl) {
		this.ssl = ssl;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public void mailCheck() {
		System.out.println("Mailcheck to: " + name + " " + ", address: " + address);
	}

}
