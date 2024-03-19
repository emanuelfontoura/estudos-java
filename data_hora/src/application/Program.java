package application;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Program {

	public static void main(String[] args) {
		// INSTANCIAR DATA-HORA DE AGORA
		LocalDate d01 = LocalDate.now();
		System.out.println(d01);
		
		LocalDateTime d02 = LocalDateTime.now();
		System.out.println(d02);
		
		Instant d03 = Instant.now();
		System.out.println(d03);
		
		// INSTANCIAR DATA-HORA DE UMA DATA 
		LocalDate d04 = LocalDate.parse("2022-07-20");
		System.out.println(d04);
		
		LocalDateTime d05 = LocalDateTime.parse("2022-07-20T01:30:26");
		System.out.println(d05);
		
		Instant d06 = Instant.parse("2022-07-20T01:30:26Z");
		System.out.println(d06);
		
		// INSTANCIAR DATA-HORA NO FUSO DIFERENTE DO GMT FAZ COM QUE
		// O JAVA CONVERTA ESSA HORA PARA O FUSO GMT
		Instant d07 = Instant.parse("2022-07-20T01:30:26-03:00");
		System.out.println(d07);
		
		// TEXTO DE DATA-HORA CUSTOMIZADO NA HORA DE INSERIR
		// PARA INSTANCIAR
		DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		LocalDate d08 = LocalDate.parse("20/07/2022", fmt1);
		System.out.println(d08);
		
		LocalDateTime d09 = LocalDateTime.parse("20/07/2022 01:30", DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm"));
		System.out.println(d09);
		
		// INSTANCIAR DATA-HORA PASSANDO A DATA EM ARGUMENTOS
		LocalDate d10 = LocalDate.of(2022, 7, 20);
		System.out.println(d10);
		
		LocalDateTime d11 = LocalDateTime.of(2022, 7, 20, 1, 30);
		System.out.println(d11);
	}

}
