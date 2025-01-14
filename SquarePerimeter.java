// write a program to find the perimeter of the square
package Object;

import java.util.Scanner;

public class SquarePerimeter {

	public static void main(String[] args) {
		
	        // Create a scanner object for input
	        Scanner sc = new Scanner(System.in);

	        // Prompt the user to enter the side length of the square
	        System.out.print("Enter the side length of the square: ");
	        double sideLength = sc.nextDouble();

	        // Calculate the perimeter of the square
	        double perimeter = 4 * sideLength;

	        // Display the result
	        System.out.println("The perimeter of the square is: " + perimeter);

	        // Close the scanner
	        sc.close();
	}
}
/*Output
Enter the side length of the square: 2
The perimeter of the square is: 8.0
 */
