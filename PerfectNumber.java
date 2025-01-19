//Write a java program to check given number is perfect number or not 
package Object;
import java.util.Scanner;

public class PerfectNumber {

	public static void main(String[] args) {
		// Create a Scanner object for user input
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number:");
		int num = sc.nextInt();

		//isPerfectNumber method
		if (isPerfectNumber(num)) {
			System.out.println(num + " is a perfect number.");
		} else {
			System.out.println(num + " is not a perfect number.");
		}

	}
	// Method to check if a number is a perfect number
	public static boolean isPerfectNumber(int num1) {
		if (num1 <= 1) {
			return false; // Numbers less than or equal to 1 cannot be perfect numbers
		}
		int sum = 0;

		// Find all divisors and calculate their sum
		for (int i = 1; i <= num1 / 2; i++) {
			if (num1 % i == 0) {
				sum += i;
			}
		}
		// Check if the sum of divisors equals the original number
		return sum == num1;
	}
}
/*Output:
Enter a number:10
10 is not a perfect number
Enter a number:6
6 is a perfect number.
 */
