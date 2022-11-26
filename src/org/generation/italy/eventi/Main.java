package org.generation.italy.eventi;

import java.math.BigDecimal;
import java.time.LocalDate;
//import java.util.List;
//import java.util.Scanner;
import java.time.LocalTime;

public class Main {
	public static void main(String[] args) {
		
//		Scanner sc = new Scanner(System.in);
//		
//		System.out.print("Inserire nome evento: ");
//		String titolo = sc.next();
//		
//		System.out.print("Inserire la data dell'evento (aaaa-mm-gg): ");
//		String dataStr = sc.next();
//		LocalDate data = LocalDate.parse(dataStr);
//		
//		System.out.print("Inserire numero posti totale: ");
//		int postiTotale = sc.nextInt();
//		
//		Evento ev1 = null; 
//		try {
//			ev1 = new Evento(titolo, data, postiTotale);
//		} catch (Exception e) {
//			e.printStackTrace();
//		} finally {
//			System.out.println(ev1 == null ? "Non è stato possibile creare l'evento" : ev1);			
//		}
//		
//		System.out.println("-------------------\nVuoi effettuare prenotazioni? ");
//		boolean check = sc.nextBoolean();
//		if(check) {
//			System.out.println("Quante prenotazioni vuoi effettuare? ");
//			int numeroPrenotazioni = sc.nextInt();
//			
//			for (int i = 0; i < numeroPrenotazioni; i++) {
//				try {
//					ev1.prenota();
//				} catch (Exception e) {
//					System.err.println(e.getMessage());
//				}
//			}
//			
//			System.out.println("Posti prenotati: " + ev1.getPostiPrenotati() 
//								+ "\nPosti disponibili: " + (ev1.getPostiTotale() - ev1.getPostiPrenotati()));
//		}
//		
//		System.out.println("-------------------\nVuoi disdire prenotazioni? ");
//		boolean checkD = sc.nextBoolean();
//		if(checkD) {
//			System.out.println("Quante disdette vuoi effettuare? ");
//			int numeroDisdette = sc.nextInt();
//			
//			for (int i = 0; i < numeroDisdette; i++) {
//				try {
//					ev1.disdici();
//				} catch (Exception e) {
//					System.err.println(e.getMessage());
//				}
//			}
//			
//			System.out.println("Posti prenotati: " + ev1.getPostiPrenotati() 
//								+ "\nPosti disponibili: " + (ev1.getPostiTotale() - ev1.getPostiPrenotati()));
//		}
//		
//		sc.close();
		
		//Milestone 3
		
//		Evento e1 = null;
//		Evento e2 = null;
//		Evento e3 = null;
//		Evento e4 = null;
//		Evento e5 = null;
//		
//		try {
//			e1 = new Evento("Woo", LocalDate.parse("2023-08-05"), 30 );
//			e2 = new Evento("Wii", LocalDate.parse("2023-08-05"), 20 );
//			e3 = new Evento("Wee", LocalDate.parse("2023-07-05"), 50 );
//			e4 = new Evento("Waa", LocalDate.parse("2023-06-20"), 20 );
//			e5 = new Evento("Wuu", LocalDate.parse("2023-06-20"), 50 );
//		} catch (Exception e) {
//			System.err.println(e.getMessage());
//		}
//		
//		ProgrammEventi pe = new ProgrammEventi("Estate");
//		pe.addEvento(e1);
//		pe.addEvento(e2);
//		pe.addEvento(e3);
//		pe.addEvento(e4);
//		pe.addEvento(e5);
//		System.out.println(pe);
//		
//		List<Evento> eventi5Agosto = pe.getEventiByData(LocalDate.parse("2023-08-05"));
//		
//		System.out.println("Eventi presenti il 5 agosto: " + eventi5Agosto);
//		System.out.println("------------------");
//		System.out.println("Numero eventi presenti nel programma: " + pe.getNumeroEventi());
//		pe.clearEventi();
//		System.out.println("Numero eventi presenti nel programma dopo clear: " + pe.getNumeroEventi());
		
		//Milestone 4
		
//		Concerto c = null;
//		try {
//			c = new Concerto("Noisia", LocalDate.parse("2023-08-05"), 500, LocalTime.parse("22:00"), BigDecimal.valueOf(19.99));
//			for(int i = 0; i < 300; i++ ) {
//				c.prenota();				
//			}
//			
//		} catch (Exception e) {
//			System.err.println(e.getMessage());
//		}
//		
//		System.out.println(c);
//		System.out.println("Posti disponibili: " + c.getPostiDisponibili());
//		
//		try {
//			for(int i = 0; i < 20; i++ ) {
//				c.disdici();				
//			}
//			
//		} catch (Exception e) {
//			System.err.println(e.getMessage());
//		}
//		
//		System.out.println("Posti disponibili: " + c.getPostiDisponibili());
		
		//Milestone 5
		
		Evento e1 = null;
		Evento e2 = null;
		Evento e3 = null;
		Evento e4 = null;
		
		try {
			e1 = new Evento("Woo", LocalDate.parse("2023-08-05"), 30 );
			e2 = new Evento("Woo", LocalDate.parse("2023-08-05"), 30 );
			e3 = new Evento("Woo", LocalDate.parse("2023-08-06"), 30 );
			e4 = new Evento("Wii", LocalDate.parse("2023-08-05"), 30 );
		} catch (Exception e) {
			System.err.println(e.getMessage());
		}
		
		System.out.println("e1 equals e2: " + e1.equals(e2));
		System.out.println("e1 equals e3: " + e1.equals(e3));
		System.out.println("e1 equals e2: " + e1.equals(e4));


	}
}
