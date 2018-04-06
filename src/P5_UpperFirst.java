/*
  	ISYS 320
  	Name(s): Derek Stone
  	Date:    April-06-2018
*/

public class P5_UpperFirst {

	public static void main(String[] args) {
		System.out.println(upperFirst("Lebron.James", "."));
	}
	
	public static String upperFirst(String str, String delimiter){
		str = str.substring(0, str.indexOf(delimiter)).toUpperCase() + str.substring(str.indexOf(delimiter), str.length());
		return str;
	}

}
