package serilization;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

public class Person implements Externalizable {

	public int id;

	public String name;

	public String gender;

	@Override
	public void writeExternal(ObjectOutput out) throws IOException {
		out.writeInt(id);
		out.writeObject(name + "-name");
		out.writeObject("abc" + gender);

	}

	@Override
	public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
		id = in.readInt();
		name = (String) in.readObject();

		// if (name.endsWith("name")) {
		// throw new IOException("corrupted data - name");
		// }

		name = name.substring(0, name.length() - 3);

		gender = (String) in.readObject();

		if (!gender.startsWith("abc")) {
			throw new IOException("corrupted data - age");
		}

		gender = gender.substring(3);

	}

	@Override
	public String toString() {
		return "Person{id= " + id + ", name=" + name + ", gender=" + gender + "}";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

}
