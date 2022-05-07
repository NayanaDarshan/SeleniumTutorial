
/*Given an integer X.
Print "Fizz" if X is only divisible by 3.
Print "Buzz" if X is a multiple of 5.
Print "FizzBuzz" if X is a multiple of both 3 and 5.
Otherwise, print X.
*/
package BasicWeb;

public class FizzBuzz {

	public static void main(String[] args) {

		int num = 50;
		
		if(num%3==0 && num%5==0) {
			System.out.println("FizzBuzz");
		}
		else  if(num%3==0) {
			System.out.println("Fizz");
		}
		
		else if(num%5==0) {
			System.out.println("Buzz");
			
		}
	}

}
