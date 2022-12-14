package org.generation.italy.eventi;

import java.time.LocalDate;

public class Evento {
	private String titolo;
	private LocalDate data;
	private int postiTotale;
	private int postiPrenotati;
	
	public Evento(String titolo, LocalDate data, int postiTotale) throws Exception {
		setTitolo(titolo);
		setData(data);
		if(postiTotale < 0) {
			throw new Exception("Il numero di postiTotale non può essere negativo");
		}
		this.postiTotale = postiTotale;
		this.postiPrenotati = 0;
	}
	
	public String getTitolo() {
		return titolo;
	}
	public void setTitolo(String titolo) {
		this.titolo = titolo;
	}
	public LocalDate getData() {
		return data;
	}
	public void setData(LocalDate data) throws Exception {
		if(data.isBefore(LocalDate.now())) {
			throw new Exception("La data inserita non è valida");
		}
		this.data = data;
	}
	public int getPostiTotale() {
		return postiTotale;
	}
	public int getPostiPrenotati() {
		return postiPrenotati;
	}
	
	public int getPostiDisponibili() {
		return getPostiTotale() - getPostiPrenotati();
	}
	
	public void prenota() throws Exception {
		if (postiPrenotati == postiTotale || data.isBefore(LocalDate.now())) {
			throw new Exception("Non è più possibile partecipare all'evento");
		} 
		postiPrenotati++;
	}
	
	public void disdici() throws Exception {
		if (postiPrenotati == 0 || data.isBefore(LocalDate.now())) {
			throw new Exception("Non è più possibile disdire la prenotazione all'evento");
		} 
		postiPrenotati--;
	}
	
	protected String getDataFormattata() {
		return data.getDayOfMonth() + "/" + data.getMonthValue() + "/" + data.getYear();
	}
	
	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Evento) {
			Evento e = (Evento) obj;
			return e.getTitolo().equals(titolo) && e.getData().equals(data);
		}
		return false;
	}

	@Override
	public String toString() {
		return getDataFormattata() + " - " + getTitolo();
	}
}
