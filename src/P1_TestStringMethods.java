/*
  	ISYS 320
  	Name(s): Derek Stone
  	Date:    April-06-2018
*/

/*
 Your expression predictions:
 
 1.	13
 2.	a
 3. G
 4.	2
 
 5.	GANDALF THE GRAY
 6.	frodo baggins
 7.	do Baggins
 8.	ndalf the GR
 
 9.	Goondoolf the GRAY
 10.Gandalf the GRAY
 11. strange1
 
  
 */

/*
 Were you correct? Explain if you were not (what did you learn?)
 
13
a
G
2
GANDALF THE GRAY
frodo baggins
o Baggins  	[Prediction was wrong as substring first index begin with zero]
dalf the GR [Prediction was wrong as substring first index begin with zero]
Goondoolf the GRAY
Gandalf the GRAY
strange1
 
 */
public class P1_TestStringMethods {
	public static void main(String[] args) {
		String str1 = "Frodo Baggins";
		String str2 = "Gandalf the GRAY";
		System.out.println(str1.length());
		System.out.println(str1.charAt(7));
		System.out.println(str2.charAt(0));
		System.out.println(str1.indexOf("o"));
		System.out.println(str2.toUpperCase());
		System.out.println(str1.toLowerCase());
		System.out.println(str1.substring(4) );
		System.out.println(str2.substring(3, 14));
		System.out.println(str2.replace( "a", "oo"));
		System.out.println(str2.replace("gray", "white"));
		System.out.println("str1".replace("r",  "range"));
	}

}
