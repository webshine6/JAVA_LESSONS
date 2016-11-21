import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.sql.Date;
import java.text.StringCharacterIterator;

public class SavingAccounts implements Serializable {

	private static final long serialVersionUID = 1L;

	private String firstName;

	private String lastName;

	private int accountNumber;

	private Date fDateOpened;

	public SavingAccounts(String aFirstName, String aLastName, int accountNumber, Date dateOpened) {
		setFirstName(aFirstName);
		setLastName(aLastName);
		setAccountNumber(accountNumber);
		setDateOpened(new Date(dateOpened.getTime()));
	}

	public SavingAccounts() {
		this("First name", "Last name", 0, new Date(System.currentTimeMillis()));
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public int getAccountNumber() {
		return accountNumber;
	}

	public Date getDateOpened() {
		return new Date(fDateOpened.getTime());
	}

	public void setFirstName(String aNewFirstName) {
		validateName(aNewFirstName);
		this.firstName = aNewFirstName;
	}

	public void setLastName(String aNewLastName) {
		validateName(aNewLastName);
		this.lastName = aNewLastName;
	}

	public void setAccountNumber(int newAccountNumber) {
		validateAccountNumber(newAccountNumber);
		this.accountNumber = newAccountNumber;
	}

	public void setDateOpened(Date newDateOpened) {

		Date newDate = new Date(newDateOpened.getTime());
		validateDateOpened(newDate);
		fDateOpened = newDate;
	}

	public void validateState() {
		validateName(firstName);
		validateName(lastName);
		validateAccountNumber(accountNumber);
		validateDateOpened(fDateOpened);
	}

	// validate
	public void validateName(String aName) {

		boolean nameHasContent = (aName != null) && (!aName.equals(""));

		if (!nameHasContent) {
			throw new IllegalArgumentException("Name must be non-null and non-empty");
		}

		StringCharacterIterator iterator = new StringCharacterIterator(aName);

		char currentChar = iterator.current();

		while (currentChar != iterator.DONE) {
			boolean isValidChar = (Character.isLetter(currentChar)) || (Character.isSpaceChar(currentChar))
					|| (currentChar == '\'');

			if (isValidChar) {

			} else {
				String message = "Names can contain only letters, spaces, and apostrophes.";

				throw new IllegalArgumentException(message);
			}

			currentChar = iterator.next();
		}

	}

	public void validateAccountNumber(int accountNumber) {
		if (accountNumber < 0) {
			String message = "Account Number must be greater than or equal to 0.";
			throw new IllegalArgumentException(message);
		}

	}

	public void validateDateOpened(Date aDateOpened) {
		if (aDateOpened.getTime() < 0) {
			throw new IllegalArgumentException("Date Opened must be after 1970.");
		}
	}

	// serialize and deserialize
	private void readObject(ObjectInputStream oInputStream) throws IOException, ClassNotFoundException {
		oInputStream.defaultReadObject();
		fDateOpened = new Date(fDateOpened.getTime());
		validateState();
	}

	private void writeObject(ObjectOutputStream aOutputStream) throws IOException {
		aOutputStream.defaultWriteObject();
	}

}
