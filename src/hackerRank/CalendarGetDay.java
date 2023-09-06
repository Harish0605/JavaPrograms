package hackerRank;

import java.text.Format;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class CalendarGetDay {

	public static void main(String[] args) {
		Calendar rightNow = Calendar.getInstance();
		
		rightNow.set(2022, 7, 18); // month-1 need to be given
		Date d = rightNow.getTime();
		Format f = new SimpleDateFormat("EEEE");
		String str = f.format(d).toUpperCase();     
	      
		System.out.println(str);
		
	}

}
