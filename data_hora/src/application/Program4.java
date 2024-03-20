package application;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class Program4 {

	public static void main(String[] args) {
		// CÁLCULOS COM DATA-HORA
		LocalDate d01 = LocalDate.parse("2022-07-20");
		LocalDateTime d02 = LocalDateTime.parse("2022-07-20T01:30:26");
		Instant d03 = Instant.parse("2022-07-20T01:30:26Z");
		
		// DATA-HORA +/- TEMPO
		LocalDate pastWeek = d01.minusWeeks(1);
		LocalDate nextWeek = d01.plusDays(7);
		
		System.out.println("pastWeek: " + pastWeek);
		System.out.println("nextWeek: " + nextWeek);
		
		Instant pastInstant = d03.minus(7, ChronoUnit.DAYS);
		Instant nextInstant = d03.plus(7, ChronoUnit.DAYS);
		
		System.out.println("pastInstant: " + pastInstant);
		System.out.println("pastInstant: " + nextInstant);
	}

}
