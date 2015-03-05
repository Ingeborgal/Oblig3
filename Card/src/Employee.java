import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;


public class Employee extends Card{

	public Scanner scan = new Scanner(System.in);
	
	public Employee(String firstName, String lastName, int pinCode){
		this.firstName = firstName;
		this.lastName = lastName;
		this.pinCode = pinCode;	
	}
	
	@SuppressWarnings("static-access")
	public void accessTime(){
		GregorianCalendar time = new GregorianCalendar();
		if(time.HOUR_OF_DAY < 7 || time.HOUR_OF_DAY > 17){
			System.out.println("Enter pin: ");
			int pin = scan.nextInt();
			checkPIN(pin);
		}
	}
	
	boolean checkPIN(int pin) {
		if (this.pinCode == pin){
			return true;
		} else{
			return false;
		}
	}
}
