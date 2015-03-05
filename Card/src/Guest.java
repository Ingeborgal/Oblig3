import java.util.Calendar;
import java.util.GregorianCalendar;


public class Guest extends Card implements Permanent{
	
	GregorianCalendar suspendCard;

	
	
	public Guest(String firstName, String lastName, int pinCode){
		this.firstName = firstName;
		this.lastName = lastName;
		this.pinCode = 9999;
		
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