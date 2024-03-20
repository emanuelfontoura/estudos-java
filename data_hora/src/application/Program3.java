package application;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;

public class Program3 {

	public static void main(String[] args) {
		// CONVERTER DATA-HORA GLOBAL PARA LOCAL
		Instant globalDate = Instant.now();
		
		LocalDate d01 = LocalDate.ofInstant(globalDate, ZoneId.of("Z"));
		System.out.println(d01);
		
		LocalDateTime d02 = LocalDateTime.ofInstant(globalDate, ZoneId.of("Z"));
		System.out.println(d02);
		
		// OBTER DADOS A PARTIR DE UMA DATA-HORA LOCAL (INSTANT NÃO DÁ)
		System.out.println("d01 dia: " + d01.getDayOfMonth());
		System.out.println("d01 mês: " + d01.getMonth());
		System.out.println("d01 ano: " + d01.getYear());
		System.out.println("d02 hora: " + d02.getHour());
	}

}
