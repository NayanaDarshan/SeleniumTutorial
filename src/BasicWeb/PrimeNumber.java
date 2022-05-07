package BasicWeb;

public class PrimeNumber {

	public static void main(String[] args) {
		int num = 7;
		boolean isprime = true;

		for (int i = 2; i < 29; i++) {

			if (num % i == 0) {
				isprime = false;
				break;
			}
		}

		if (isprime) {

			System.out.println(" The number is prime====>" + num);
		} else {
			System.out.println(" The number is not prime====>" + num);
		}
	}

}
