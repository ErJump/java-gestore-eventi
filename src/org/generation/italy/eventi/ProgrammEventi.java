package org.generation.italy.eventi;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class ProgrammEventi {
	private String titolo;
	private List<Evento> eventi;
	

	public ProgrammEventi(String titolo2) {
		this.titolo = titolo2;
		this.eventi = new ArrayList<>();
	}

	public void addEvento(Evento e) {
		eventi.add(e);
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

	@Override
	public String toString() {
		return titolo + "\n" + eventi;
	}
}
