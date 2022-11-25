package org.generation.italy.eventi;

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
	
	@Override
	public String toString() {
		return titolo + "\n" + eventi;
	}
}
