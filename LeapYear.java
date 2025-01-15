/* Write a program to check leap year using if else.
   How to check whether a given year is a leap year or not */
package Object;
import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		// Create a Scanner object for user input
		Scanner sc=new Scanner(System.in);
		// Prompt the user to enter a year
		System.out.println("Enter a year");
		int year=sc.nextInt();
		// Check if the year is a leap year
		if(year%4==0) {
			System.out.println(year+" is leap year");
		}
		else {
			System.out.println(year+" is not leap year");
		}
	}
}
/*Output
Enter a year
2004
2004 is leap year
Enter a year
2013
2013 is not leap year
 */
