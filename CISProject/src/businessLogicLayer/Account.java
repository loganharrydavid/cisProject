package businessLogicLayer;


import java.util.ArrayList;
import java.util.InputMismatchException;

public class Account implements Comparable<Account> {
	
	private String accountID;
	private String firstName;
	private String lastName;
	private String address;
	private String email;
	private String state;
	private int zipCode;
	private String ssn;
	private ArrayList<Flight> flights;
	private String userName;
	private String password;
	private String securityQuestion;
	private String securityAnswer;
	

	public Account() {
		
	}

	public Account(String firstname, String lastName, String address, String email,
			String State, int zipCode, String ssn, String userName, String password, String sq) {
		
		this.firstName = firstname;
		this.lastName = lastName;
		this.address = address;
		this.email = email;
		this.state = State;
		this.zipCode = zipCode;
		this.ssn = ssn;
		this.userName = userName;
		this.password = password;
		this.securityQuestion = sq;
		this.securityAnswer = "default";

	}
	
	
	public String getAccountID() {
		return accountID;
	}
	
	public ArrayList<Flight> getFlights() {
		return flights;
	}

	public void addFlight(Flight flight) {
		
		this.flights.add(flight);
		
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}


	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public int getZipCode() {
		return zipCode;
	}

	public void setZipCode(int zipCode) {
		this.zipCode = zipCode;
	}

	public String getSsn() {
		return ssn;
	}

	public void setSsn(String ssn) {
		this.ssn = ssn;
	}
	
	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}
	
	
/* getPassword and setPassword will require input of answer to security question
 * to return the password and/or set a new one
 */

	public String getPassword(String userAnswer, String securityAnswer) throws InputMismatchException {
		
		try {
			if(userAnswer.equalsIgnoreCase(this.securityAnswer)){
				return this.password;
			}else {
					throw new InputMismatchException("Wrong answer");
					}
			
		}
			catch(InputMismatchException ex) {
				return ex.getMessage();
			}
			
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getSecurityQuestion() {
		return securityQuestion;
	}

	public void setSecurityQuestion(String securityQuestion) {
		this.securityQuestion = securityQuestion;
	}

	public String getSecurityAnswer() {
		return securityAnswer;
	}

	public void setSecurityAnswer(String securityAnswer) {
		this.securityAnswer = securityAnswer;
	}
	public static void generateAccount(String fname, String lname, String address,String email,
		String state, int zip, String ssn, String un, String pword, String secQuestion) {
		
		
		Account  acct1 = new Account(fname,lname,address,email,state, zip, ssn,un,pword,secQuestion);
		
		System.out.println(acct1.toString());	
	}

	
	@Override
	public String toString() {
		return "\nFirst name " + this.getFirstName() + "\nLast name " +
	this.getLastName() + "\nUsername " + this.getUserName() +"\nAccount ID: " + getAccountID();
	}

	@Override
	public int compareTo(Account a) {
		if (accountID == a.accountID) {
			return 0;
		} else
			return -1;
	}
	


}
