package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

public class DataHoraJava8 {

	public static void main(String[] args) throws ParseException {
		// INSTANCIANDO DATE COM E SEM SIMPLEDATEFORMAT
		
		SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy");
		SimpleDateFormat sdf2 = new SimpleDateFormat("dd/MM/yyyy HH:mm X");
		
		Date d01 = sdf1.parse("25/03/2024");
		Date d02 = sdf2.parse("25/03/2024 20:00 -0400");
		
		System.out.println(d01);
		System.out.println(d02);
		
		Date d03 = new Date();
		Date d04 = new Date(0L);
		
		System.out.println(d03);
		System.out.println(d04);
		
		Date d05 = Date.from(Instant.parse("2024-03-25T22:00:00Z"));
		
		System.out.println(d05);
		
		SimpleDateFormat sdf3 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		sdf3.setTimeZone(TimeZone.getTimeZone("GMT"));
		
		Date d06 = sdf3.parse("25/03/2024 22:00:00");
		
		System.out.println("d06 = " + d06);
		
		// MANIPULAR DATE COM CALENDAR
		
		Date d = Date.from(Instant.parse("2024-04-01T08:30:00Z"));
		System.out.println(d);
		
		Calendar cal = Calendar.getInstance();
		cal.setTime(d);
		cal.add(Calendar.HOUR_OF_DAY, 4);
		d = cal.getTime();
		
		System.out.println(d);
		
		// OBTER DADOS DE DATE COM CALENDAR
		
		int minutes = cal.get(Calendar.MINUTE);
		System.out.println("Minutes: " + minutes);
	}

}
