import java.util.Scanner;


public class TextReverser {

	public static void main(String[] args) {
		
		System.out.println("Skriv et ord: ");
		Scanner input = new Scanner(System.in);
		String ord = input.next();
		
		reverse(ord);
		
		System.out.println("Ordet reversert er: " + reverse(ord));
		

	}

	public static String reverse(String text){
		if((null == text) || (text.length() <= 1)){
			return text;
		}
		return reverse(text.substring(1)) + text.charAt(0);
	}
}