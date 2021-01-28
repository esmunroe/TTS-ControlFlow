package controlFlow;

public class AsciiChars {
	public static void printNumbers() {
		System.out.println("Numbers: ");
		for (int i = 0; i < 10; i++) {
			System.out.print(i + " ");
		}
	}
	
	public static void printUpperCase() {
		System.out.println("\nUpper Case Letters: ");
		for (int i = 65; i <= 90; i++) {
			char ch = (char) i;
			System.out.print(ch + "");
		}
	}
	
	public static void printLowerCase() {
		System.out.println("\nLower Case Letters: ");
		for (int i = 97; i <= 122; i++) {
			char ch = (char) i;
			System.out.print(ch + "");
		}
	}
}
