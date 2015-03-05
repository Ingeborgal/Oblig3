import java.util.Scanner;


public class TextReverser {

	static int teller;
	public static void main(String[] args) {
		
		System.out.println("Skriv et ord: ");
		Scanner input = new Scanner(System.in);
		String ord = input.next();
		
		reverse(ord);
		
		teller = ord.length();
		
		System.out.println("Ordet reversert er: " + reverse(ord));
		
		System.out.println("Antall bokstaver i ordet: " + teller);

	}

	public static String reverse(String text){
		
		if((null == text) || (text.length() <= 1)){
			return text;
		}
		
		return reverse(text.substring(1)) + text.charAt(0);
	}
}