package BasicWeb;

public class ReverseTest {

	public static void main(String[] args) {
		int num = 123456;
		int rev = 0;
		
		String str = "Nayanatest";
		String rev1 = "";
		int length1= str.length();

		while (num != 0) {

			int n = num % 10;
			rev = rev * 10 + n;
			num = num / 10;
		}

		System.out.println(rev);
	

	

	for(int i =length1 - 1;i>=0;i--) {
	

		rev1 = rev1+str.charAt(i);

	}
	System.out.println(rev1);

}}