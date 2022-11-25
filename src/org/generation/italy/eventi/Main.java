package org.generation.italy.eventi;

import java.time.LocalDate;
import java.util.List;
import java.util.Scanner;

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
		
		Evento e1 = null;
		Evento e2 = null;
		Evento e3 = null;
		Evento e4 = null;
		Evento e5 = null;
		
		try {
			e1 = new Evento("Woo", LocalDate.parse("2023-08-05"), 30 );
			e2 = new Evento("Wii", LocalDate.parse("2023-08-05"), 20 );
			e3 = new Evento("Wee", LocalDate.parse("2023-07-05"), 50 );
			e4 = new Evento("Waa", LocalDate.parse("2023-06-20"), 20 );
			e5 = new Evento("Wuu", LocalDate.parse("2023-06-20"), 50 );
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		ProgrammEventi pe = new ProgrammEventi("Summer");
		pe.addEvento(e1);
		pe.addEvento(e2);
		pe.addEvento(e3);
		pe.addEvento(e4);
		pe.addEvento(e5);
		System.out.println(pe);
		
		List<Evento> eventi5Agosto = pe.getEventiByData(LocalDate.parse("2023-08-05"));
		
		System.out.println("Eventi presenti il 5 agosto: " + eventi5Agosto);
		System.out.println("------------------");
		System.out.println("Numero eventi presenti nel programma: " + pe.getNumeroEventi());
	}
}
