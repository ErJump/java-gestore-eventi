package org.generation.italy.eventi;

import java.time.LocalDate;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Inserire nome evento: ");
		String titolo = sc.next();
		
		System.out.print("Inserire la data dell'evento (aaaa-mm-gg): ");
		String dataStr = sc.next();
		LocalDate data = LocalDate.parse(dataStr);
		
		System.out.print("Inserire numero posti totale: ");
		int postiTotale = sc.nextInt();
		
		Evento ev1 = null; 
		try {
			ev1 = new Evento(titolo, data, postiTotale);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			System.out.println(ev1);			
		}
		
	}
}
