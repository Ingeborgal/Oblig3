import java.util.Calendar;
import java.util.GregorianCalendar;


public class Guest extends Card{

	int pinCode = 9999;
	GregorianCalendar suspendCard;

	public Guest(String firstName, String lastName){
		this.firstName = firstName;
		this.lastName = lastName;
		this.pinCode = 9999;
		suspendCard.add(suspendCard.DAY_OF_YEAR, 7);	
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
