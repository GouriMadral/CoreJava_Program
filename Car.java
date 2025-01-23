/*Create a parent class called "Vehicle" with attributes such as brand, model,
year, and a method called "drive". Create a child class called "Car" that 
inherits from Vehicle and has an additional attribute called "color" and a 
method called "honk". Create an object of the Car class and call both the 
"drive" and "honk" methods.
*/
package Object;
//Parent Class
class Vehicle{
	String brand="Toyota";
	String model="Camry";
	int year=2009;

	void drive() {
		System.out.println("Brand name is "+brand);
		System.out.println("Model name is "+model);
		System.out.println("Year is "+year);
	}
}
//child class(Car) extends Parent Class(Vehicle)
public class Car extends Vehicle{
	String color="Black";

	void honk() {		
		System.out.println("Color is "+color);
	}
	public static void main(String[] args) {
		Car c=new Car();
		//Calling drive() and honk() method
		c.drive();
		c.honk();
	}
}
/*Output
Brand name is Toyota
Model name is Camry
Year is 2009
Color is Black
 */