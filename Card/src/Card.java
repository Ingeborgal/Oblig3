abstract class Card {

	String lastName;
	String firstName;
	int pinCode;
	int cardNumber;
	boolean accessCode;
	boolean cardSuspended = false;

	public String getName(){
		return firstName + " " + lastName;

	}

	public int setCardNumber(){
		cardNumber = (int) (Math.random()*10000);

		return cardNumber;

	}

	public boolean isSuspended(){
		if (cardSuspended = true){
			return true;

		}else{
			return false;
		}


	}


	public String toString(){
		return null;

	}

	abstract boolean checkPIN(int pin);


}