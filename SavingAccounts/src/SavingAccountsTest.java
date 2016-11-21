import java.sql.Date;

public class SavingAccountsTest {

	public static void main(String[] args) {
		SavingAccounts obj1 = new SavingAccounts("Ralica", "iv\'", 4, new Date(System.currentTimeMillis()));

		String firstName = obj1.getFirstName();
		String lastName = obj1.getLastName();
		int accountNumber = obj1.getAccountNumber();
		Date dateOpened = obj1.getDateOpened();

		System.out.println("First name: " + firstName);
		System.out.println("Last name: " + lastName);
		System.out.println("Account number: " + accountNumber);
		System.out.println("Date opened: " + dateOpened);

	}

}
