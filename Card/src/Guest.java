import java.util.GregorianCalendar;


public class Guest extends Card{
	
	GregorianCalendar suspendCard;

	public Guest(){
		this.setFullName("Guest");
		this.setPinCode(pinCode);
	}
	
	public Guest(String fullName, int pinCode){
		super.setFullName(fullName);
		this.setPinCode(pinCode);
		
	}
	public boolean isGuestSuspended(){
	suspendCard.add(suspendCard.DAY_OF_YEAR, 7);
	return cardSuspended;
	}

	@Override
	boolean checkPIN(int pin) {
		if (this.pinCode == pin){
			return true;
		} else{
			return false;
		}
	}
	
	@Override
	public int compareTo(Card card) {
		if(this.getFullName().compareTo(card.getFullName()) != 0){
			return this.getFullName().compareTo(card.getFullName());
		}else{
			return this.getFirstName().compareTo(card.getFirstName());
		}
	}
}