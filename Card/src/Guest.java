import java.util.Calendar;
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
}