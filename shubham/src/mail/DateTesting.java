package mail;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateTesting {
	public static void main(String[] args) throws ParseException {
	String newscreate_on="2017-10-24 03:22:16";
		Date date=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").parse(newscreate_on);
		String date1=new SimpleDateFormat("dd-MMM-yyyy").format(date);
		System.out.println(date1);
		String time1=new SimpleDateFormat("HH:MM a").format(date);
		System.out.println(time1);
		
	}
}
