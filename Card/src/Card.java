

public abstract class Card implements Comparable<Card>, Cloneable {
	
	String lastName;
	String firstName;
	int pinCode;
	int cardNumber;
	boolean accessCode;
	boolean cardSuspended;
	private String fullName;
	
	public Card(){}
	
	public Card(String fullName, int pinCode){
		this.fullName = fullName;
		this.pinCode = pinCode;
		this.cardSuspended = false;
		this.accessCode = false;
	}

	public String getName(){
		return fullName;

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
		return "Name: " + setFullName(fullName) + " Pin code: " + getPin() + " Suspended: " + isSuspended();

	}
	
	public void setPinCode(int pinCode){
		this.pinCode = pinCode;
	}
	private int getPin() {
		return pinCode;
	}

	abstract boolean checkPIN(int pin);
	
	public String setFirstName(String firstName){
		return this.firstName = firstName;
	}
	
	public String getFirstName() {
		return firstName;
	}
	
	public String setLastName(String lastName) {
		return this.lastName = lastName;
	}
	
	public String getLastName() {
		return lastName;
	}
	
	public String setFullName(String fullName) {
		return this.fullName = fullName;
	}
	
	public String getFullName() {
		return fullName;
	}
	
	@Override
	public int compareTo(Card card) {
		if(this.getFullName().compareTo(card.getFullName()) != 0){
			return this.getFullName().compareTo(card.getFullName());
		}else{
			return this.getFirstName().compareTo(card.getFirstName());
		}
	}
	
	public static Card cloneCard(Card card) throws CloneNotSupportedException {
        
        return (Card) card.clone();
    }
}

