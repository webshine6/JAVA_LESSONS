package serinheritance;

import java.io.Externalizable;
import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInput;
import java.io.ObjectInputValidation;
import java.io.ObjectOutput;

public class SubClass extends SuperClass implements Externalizable, ObjectInputValidation {

	private static final long serialVersionUID = -4382410737858504731L;

	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String toString() {
		return "SubClass={id:" + getId() + ", value: " + getValue() + ", name: " + getName() + "}";
	}

	@Override
	public void writeExternal(ObjectOutput out) throws IOException {
		out.writeInt(getId());
		out.writeObject(getValue());
		out.writeObject(getName());

	}

	@Override
	public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {

		name = (String) in.readObject();
		setValue(in.readInt());
		setId(in.readInt());
	}

	@Override
	public void validateObject() throws InvalidObjectException {

		if (name == null || name.equals("")) {
			throw new InvalidObjectException("Name cant be null or empty");
		}

		if (getId() <= 0) {
			throw new InvalidObjectException("Id must be positive");
		}

	}

}
