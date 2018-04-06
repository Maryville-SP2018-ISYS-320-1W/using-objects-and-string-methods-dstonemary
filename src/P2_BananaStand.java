/*
  	ISYS 320
  	Name(s): Derek Stone
  	Date:    April-06-2018
*/


public class P2_BananaStand {
	public static void main(String[] args) {
		String quote = "There's always money in the banana stand.";
		String banana = quote.substring(quote.indexOf("banana"), quote.indexOf("stand")).toUpperCase();
		System.out.println(banana);
		System.out.println(lastHalf(quote));
		
	}
	
	public static String lastHalf(String str){
		return str.substring(str.length()/2);
	}
}
