import java.util.GregorianCalendar;
import java.util.Scanner;


public class Employee extends Card implements Permanent{

	public Scanner scan = new Scanner(System.in);
	int hourlyPayment;
	int yearsOfEmployment;
	
	public Employee(String fullName, int pinCode){
		super.setFullName(fullName);
		super.pinCode = pinCode;	
	}
	
	
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


	@Override
	public String setFirstName(String firstName) {
		
		return super.setFirstName(firstName);
	}


	@Override
	public String getFirstName() {
		
		return super.getFirstName();
	}


	@Override
	public String setLastName(String lastName) {
		
		return super.setLastName(lastName);
	}


	@Override
	public String getLastName() {
		
		return super.getLastName();
	}


	@Override
	public String setFullName(String fullName) {
		
		return super.setFullName(fullName);
	}


	@Override
	public String getFullName() {
		
		return super.getFullName();
	}


	@Override
	public double calculateCredit() {
	
		return hourlyPayment * CONSTANT;
	}


	@Override
	public double calculateBonus() {
	
		return yearsOfEmployment * CONSTANT;
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