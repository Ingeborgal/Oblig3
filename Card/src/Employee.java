import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;


public abstract class Employee extends Card{

	public Scanner scan = new Scanner(System.in);
	
	public Employee(String firstName, String lastName){
		this.firstName = firstName;
		this.lastName = lastName;
		
	}
	
	
	
	public void accessTime(){
		GregorianCalendar time = new GregorianCalendar();
		if(time.HOUR_OF_DAY < 7 || time.HOUR_OF_DAY > 17){
			System.out.println("Enter pin: ");
			int pin = scan.nextInt();
			checkPIN(pin);
		}
	}
}
