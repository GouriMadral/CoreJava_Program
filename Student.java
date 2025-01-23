/*Create a parent class called "Person" with attributes such as name, age, and 
a method called "speak". Create a child class called "Student" that inherits 
from Person and has an additional attribute called "grade" and a method 
called "study". Create an object of the Student class and call both the 
"speak" and "study" methods.
*/
package Object;
//Parent Class
class Person{
	int age=20;
	String name="Gouri";

	void speak() {
		System.out.println("Name is "+name);
		System.out.println("Age is "+age);
	}
}
//Child class(Student) extends Parent class(Person)
public class Student extends Person {
	String grade="A";
	void study() {
		System.out.println("Grade is "+grade);

	}
	public static void main(String[] args) {
		Student s=new Student();
		//Calling speak() and study() method
		s.speak();
		s.study();

	}
}
/*Output:
Name is Gouri
Age is 20
Grade is A
 */
