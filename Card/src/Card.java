import java.util.Scanner;

public abstract class Card {
	
	String lastName;
	String firstName;
	int pinCode;
	int cardNumber;
	boolean accessCode;
	boolean cardSuspended;
	private String fullName;
	
	public Card(){}
	
	public Card(String firstName, String lastName, int pinCode){
		this.firstName = firstName;
		this.lastName = lastName;
		this.pinCode = pinCode;
		this.cardSuspended = false;
		this.accessCode = false;
	}

	public String getName(){
		return firstName + " " + lastName;

	}

	public void setCardNumber(int number){
		cardNumber = number;

	}

	public boolean isSuspended(){
		return cardSuspended;

	}
	public boolean suspendCard(){
		if(isSuspended() == true){
			return true;
		}
		else{
			return false;
		}
	}


	public String toString(){
		return "Name: " + getName() + " Pin code: " + getPin() + " Suspended: " + isSuspended();

	}

	private int getPin() {
		return pinCode;
	}

	abstract boolean checkPIN(int pin);
	
	public String setFirstName(String firstName){
		return this.firstName;
	}
	
	public String getFirstName() {
		return firstName;
	}
	
	public String setLastName(String lastName) {
		return this.lastName;
	}
	
	public String getLastName() {
		return lastName;
	}
	
	public String setFullName(String fullName) {
		return this.fullName;
	}
	
	public String getFullName() {
		return fullName;
	}
	
	public int compareTo(Card card) {
		if(card == null){
			return 0;
		}
		if(this.getLastName().compareTo(card.getLastName()) < 0){
			return -1;
		}
		if(this.getLastName().compareTo(card.getLastName()) > 0){
			return 1;
		}
		if(this.getFirstName().compareTo(card.getFirstName()) < 0){
			return -1;
		}
		if(this.getFirstName().compareTo(card.getFirstName()) > 0){
			return 1;
		}
		return 0;
	}

}