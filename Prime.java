//Write a program to check given number is prime number or not
package Object;
import java.util.Scanner;

public class Prime {

	public static void main(String[] args) {
		int num;
		// Create a Scanner object for user input
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number:");
		num=sc.nextInt();
		int flag=0;// Flag is to indicate if the number is prime or not
		// for loop is to check if the number has divisors other than 1 and itself
		for(int i=2;i<num;i++) {
			if(num%i==0) {
				flag=1;
				break;
			}
		}
		if(flag==0) {
			System.out.println(num+" is Prime number");
		}
		else {
			System.out.println(num+" is not Prime number");
		}
	}
}
/*Output:
Enter a number:
5
5 is Prime number
Enter a number:
15
15 is not Prime number
 */
