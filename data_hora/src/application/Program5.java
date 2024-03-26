package application;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;

public class Program5 {

	public static void main(String[] args) {
		Instant date1 = Instant.parse("2024-03-25T20:00:00-03:00");
		Instant date2 = Instant.parse("2024-04-01T20:00:00-03:00");
		
		Duration duration1 = Duration.between(date1, date2);
		
		System.out.println(duration1.toDays());
		
		LocalDate date3 = LocalDate.parse("2024-03-25");
		LocalDate date4 = LocalDate.parse("2024-04-01");
		
		Duration duration2 = Duration.between(date3.atTime(0, 0), date4.atTime(0, 0));
		
		System.out.println(duration2.toDays());
	}

}
