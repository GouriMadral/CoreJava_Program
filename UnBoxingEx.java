// Write a java program for  Unboxing.(all types).
package String;
public class UnBoxingEx {

	public static void main(String[] args) {
		System.out.println("UnBoxing");
		Integer i1=new Integer(20);
		int i=i1.intValue();//explicit conversion of Integer
		System.out.println("Int Value: "+i);
		Float f1=new Float(20.5);
		float f=f1.floatValue();//explicit conversion of Float
		System.out.println("Float Value: "+f);
		Character c1=new Character('G');
		char c=c1.charValue();//explicit conversion of Character
		System.out.println("Character Value: "+c);
		Double d1=new Double(30.5234556575);
		double d=d1.doubleValue();//explicit conversion of Double
		System.out.println("Double Value: "+d);
		Long l1=new Long(9765237687897L);
		long l=l1.longValue();//explicit conversion of Long
		System.out.println("Long Value: "+l);
		Boolean b1=new Boolean(true);
		boolean b=b1.booleanValue();//explicit conversion of Boolean
		System.out.println("Boolean Value: "+b);
		short s1=30;
		Short s=Short.valueOf(s1);
		System.out.println("Short Value: "+s);
	}
}
/*Output
UnBoxing
Int Value: 20
Float Value: 20.5
Character Value: G
Double Value: 30.5234556575
Long Value: 9765237687897
Boolean Value: true
Short Value: 30
*/
