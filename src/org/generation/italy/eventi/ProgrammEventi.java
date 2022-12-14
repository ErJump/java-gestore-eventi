package org.generation.italy.eventi;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class ProgrammEventi {
	private String titolo;
	private List<Evento> eventi;
	

	public ProgrammEventi(String titolo) {
		this.titolo = titolo;
		this.eventi = new ArrayList<>();
	}

	public void addEvento(Evento e) {
		eventi.add(e);
	}
	
	public String getTitolo() {
		return titolo;
	}

	public List<Evento> getEventiByData(LocalDate data) {
		List<Evento> eventiByData = new ArrayList<>();
		for (Evento e : eventi) {
			if (e.getData().equals(data)) {
				eventiByData.add(e);
			}
		}
		return eventiByData;
	}
	
	public int getNumeroEventi() {
		return eventi.size();
	}
	
	public void clearEventi() {
		eventi.clear();
	}
	
	public String getListaFormattata() {
		String listaFormattata = getTitolo() + "\n";
		
		sortEventi();
		
		for (Evento e : eventi) {
			listaFormattata += e.getDataFormattata() + " - " + e.getTitolo() + "\n";
		}
		
		return listaFormattata;
	}
	
	private void sortEventi() {
		eventi.sort((e1, e2) -> e1.getData().compareTo(e2.getData()));
	}

	@Override
	public String toString() {
		return getListaFormattata();
	}
}
