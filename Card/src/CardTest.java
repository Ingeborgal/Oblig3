import java.util.ArrayList;


public class CardTest {


	public static void main(String[] args) {
		
		ArrayList<Card> reg = new ArrayList<Card>();
		
		Card card1 = new Employee("Ole", "Olsen", 1234);
		Card card2 = new Guest("Marit", "Olsen", 9999);
		
		reg.add(card1);
		reg.add(card2);
		
		for (int i = 0; i < reg.size(); i++){
			Card card =(Card)reg.get(i);
			System.out.print(card);
			System.out.println("\nTest av kort: med kode 1234 er " + (card.checkPIN(1234) ? "Gyldig" : "Ugyldig"));
			System.out.println("\nTest av kort: med kode 9999 er " + (card.checkPIN(9999) ? "Gyldig" : "Ugyldig"));
		}
	
	}
	
}
