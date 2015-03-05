import java.util.Scanner;


public class TextReverser {

	static int teller;
	public static void main(String[] args) {

		System.out.println("Skriv et ord: ");
		Scanner input = new Scanner(System.in);
		String ord = input.next();

		teller = ord.length();

		System.out.println("Ordet reversert er: ");

		reverse(ord);

	}

	public static void reverse(String text){
		reverse(text, text.length()-1);

	}

	public static void reverse(String text, int last){
		if(last >= 0){
			System.out.print(text.charAt(last));

			reverse(text, last -1);
		}
		else{
			System.out.println("\nAntall bokstaver i ordet: " + teller);
		}
	}
}