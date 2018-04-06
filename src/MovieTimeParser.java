/*
  	ISYS 320
  	Name(s): Derek Stone
  	Date:    April-06-2018
*/
public class MovieTimeParser {

	
	public static void main(String[] args) {
		String movTime = "9:00a,11:15a,1:30p,3:00p,6:45p,9:00p";
		System.out.println(getMovieTime(movTime, 3));
	}
	public static String getMovieTime(String movTime, int index){
		String time = "";
		movTime = movTime+",";
		for(int i = 1; i <= index; i++){			
			if(movTime.indexOf(",") < 0){
				time = "No Time Available";
				break;
			}else{
				time = movTime.substring(0, movTime.indexOf(","));
			}
			movTime = movTime.substring(time.length()+1);
		}
		if(index <= 0)
			return "No Time Available";
		else
			return time;
	}

}
