//Write  a java program for Autoboxing.(All Primitive Types)
package String;
public class Autoboxing {

	public static void main(String[] args) {
		System.out.println("AutoBoxing");
		int var=20;
		Integer i=Integer.valueOf(var);//explicit conversion of Integer
		System.out.println("Int Value: "+i);
		float f1=20.5f;
		Float f=Float.valueOf(f1);//explicit conversion of Float
		System.out.println("Float Value: "+f);
		char c1='G';
		Character c=Character.valueOf(c1);//explicit conversion of Character
		System.out.println("Character Value: "+c);
		double d1=30.5234556575;
		Double d=Double.valueOf(d1);//explicit conversion of Double
		System.out.println("Double Value: "+d);
		long l1=9765237687897L;
		Long l=Long.valueOf(l1);//explicit conversion of Long
		System.out.println("Long Value: "+l);
		boolean b1=true;
		Boolean b=Boolean.valueOf(b1);//explicit conversion of Boolean
		System.out.println("Boolean Value: "+b);
		short s1=32745;
		Short s=Short.valueOf(s1);//explicit conversion of Short
		System.out.println("Short Value: "+s);	
	}
}
/*Output
AutoBoxing
Int Value: 20
Float Value: 20.5
Character Value: G
Double Value: 30.5234556575
Long Value: 9765237687897
Boolean Value: true
Short Value: 32745
 */
