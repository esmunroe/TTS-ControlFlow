package controlFlow;

import java.util.Random;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		AsciiChars.printNumbers();
		AsciiChars.printUpperCase();
		AsciiChars.printLowerCase();
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("\nPlease enter your name: ");
		String name = scanner.next();
		System.out.println("Hello " + name);
		
		String choice = "";
		System.out.print("Do you wish to continue? (yes, no) ");
		choice = scanner.next();
		
		String petName = "";
		int petAge = 0;
		int luckyNum = 0;
		int qbNum = 0;
		int modelYear = 0;
		String favActor = "";
		int randomNum = 0;
		String playAgain = "";
		
		if (choice.equals("yes") || choice.equals("y")) {
			do {
				System.out.print("What is the name of your favorite pet? ");
				petName = scanner.next();
				System.out.print("What is the age of your favorite pet? ");
				petAge = scanner.nextInt();
				System.out.print("What is your lucky number? ");
				luckyNum = scanner.nextInt();
				System.out.print("Do you have a favorite quarterback?  If so, what is their jersey number? ");
				qbNum = scanner.nextInt();
				System.out.print("What is the two-digit model year of your car? (e.g. 99) ");
				modelYear = scanner.nextInt();
				System.out.print("What is the first name of your favorite actor/actress? ");
				favActor = scanner.next();
				System.out.print("Enter a number between 1 and 50? ");
				randomNum = scanner.nextInt();
				
				Random rnd = new Random();
				final int MAGIC_BALL_MAX = 75;
				final int LOTTO_MAX = 65;
				int genNum = rnd.nextInt(LOTTO_MAX - 1) + 1;
				
				int magicBall = 0;
				int firstLotto = 0;
				int secondLotto = 0;
				int thirdLotto = 0;
				int fourthLotto = 0;
				int fifthLotto = 0;
			
				magicBall = qbNum * randomNum;
				firstLotto = (int) petName.charAt(2);
				secondLotto = modelYear + luckyNum;
				thirdLotto = (int) favActor.charAt(0);
				fourthLotto = petAge + modelYear;
				fifthLotto = qbNum + petAge + luckyNum;
				
				while (magicBall > MAGIC_BALL_MAX) {
					magicBall -= MAGIC_BALL_MAX;
				}
				if (firstLotto > LOTTO_MAX) {
					firstLotto -= LOTTO_MAX;
				}
				if (secondLotto > LOTTO_MAX) {
					secondLotto -= LOTTO_MAX;
				}
				if (thirdLotto > LOTTO_MAX) {
					thirdLotto -= LOTTO_MAX;
				}
				if (fourthLotto > LOTTO_MAX) {
					fourthLotto -= LOTTO_MAX;
				}
				if (fifthLotto > LOTTO_MAX) {
					fifthLotto -= LOTTO_MAX;
				}
				
				System.out.println("Lottery Numbers: "  + firstLotto + " " + secondLotto + " " + thirdLotto + " " + fourthLotto + " " + fifthLotto);
				System.out.println("Magic Ball: " + magicBall);
				
				System.out.print("Do you wish to play again? ");
				playAgain = scanner.next();
			} while (playAgain.equals("yes") || playAgain.equals("y"));
		}
		
		System.out.println("Thank you! Goodbye.");
		scanner.close();
	}

}
