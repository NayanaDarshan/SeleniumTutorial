package BasicWeb;

import java.util.Scanner;

public class PositiveNegative {

	public static void main(String[] args) {

		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Please enter the number");
		
		double number = scan.nextDouble();
		

		if (number > 0) {
			System.out.println("The given number is positive" + number);
		}

		else if (number < 0) {
			System.out.println("the given number is negative " + number);
		}

		else if (number == 0) {

			System.out.println("The given " + number + "is Zero");

		}
	}
}