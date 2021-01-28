package controlFlow;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		AsciiChars.printNumbers();
		AsciiChars.printUpperCase();
		AsciiChars.printLowerCase();
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Please enter your name: ");
		String name = scanner.next();
		System.out.println("Hello " + name);
		
		scanner.close();
	}

}
