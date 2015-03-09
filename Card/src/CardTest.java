import java.util.ArrayList;
import java.util.Collections;

public class CardTest{
	
	public static void main(String[] args) throws CloneNotSupportedException {
		
		ArrayList<Card> reg = new ArrayList<Card>();
		
		
		Card emp1 = new Employee("Ole Olsen", 1234);
		Card emp2 = new Employee("Karl Karlsen", 2356);
		
		Card gue1 = new Guest("Marit Olsen", 9999);
		Card gue2 = new Guest("Lars Larsen", 9999);
	
		reg.add(emp1);
		reg.add(emp2);
		reg.add(gue1);
		reg.add(gue2); 
			
		Collections.sort(reg);
	
		for (int i = 0; i < reg.size(); i++){
			Card card = reg.get(i);
			
			
			System.out.print(card);
			System.out.println("\nTest av kort med kode: 1234 er " + (card.checkPIN(1234) ? "Gyldig" : "Ugyldig"));
			System.out.println("\nTest av kort med kode: 9999 er " + (card.checkPIN(9999) ? "Gyldig" : "Ugyldig"));
			System.out.println("\nTest av kort med kode: 2356 er " + (card.checkPIN(2356) ? "Gyldig" : "Ugyldig") + "\n\n");

		}
		
		System.out.println("Clone of employee 1: " + Card.cloneCard(emp1) + "\n");

	}
}