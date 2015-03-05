import java.util.Scanner;


public class TowerOfHanoi {

	static int teller = 0;
	static int rekursivTeller = 0;
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.print("Skriv inn �nsket antall disker: ");
		int n = input.nextInt();
		
		System.out.println("Trekkene er: ");
		flyttDisker(n, 'A', 'B', 'C');
		System.out.println("Antall flyttninger er: " + teller );
		System.out.println("Antall kall til rekursiv metode er: " + rekursivTeller);
	}

	private static void flyttDisker(int n, char fraTaarn, char tilTaarn, char auxTaarn) {
		if(n== 1){
			System.out.println("Flytt disk " + n + " fra " + fraTaarn + " til " + tilTaarn);
		
	}
		else {
			flyttDisker(n-1, fraTaarn, auxTaarn, tilTaarn);
			System.out.println("flytt disk " + n + " fra " + fraTaarn + " til " + tilTaarn);
			flyttDisker(n -1, auxTaarn, tilTaarn, fraTaarn);
			rekursivTeller++;
			
		}
		
		teller++;
		
	}

}