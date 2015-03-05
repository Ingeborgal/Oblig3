import java.util.Scanner;

abstract class Card {

	
	
	String lastName;
	String firstName;
	int pinCode;
	int cardNumber;
	boolean accessCode;
	boolean cardSuspended;
	
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
		return "Name: " + getName() + "Pin code" + getPin() + "Suspended: " + isSuspended();

	}

	private int getPin() {
		return pinCode;
	}

	abstract boolean checkPIN(int pin);


}