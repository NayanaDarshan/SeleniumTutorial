package BasicWeb;

public class AMissingNum {

	public static void main(String[] args) {
		int a[] = { 1, 2, 3, 4,5,6,8,9 };
		int sum = 0;
		int sum1 = 0;

		for (int i = 0; i < a.length; i++) {

			sum = sum + a[i];
		}

		System.out.println("The original sum is ====>" + sum);

		for (int j = 0; j <= 9; j++) {

			sum1 = sum1 + j;
		}

		System.out.println("The number sum is ====> " + sum1);

		System.out.println("The missing number is ====>" + (sum1 - sum));
	}

}
