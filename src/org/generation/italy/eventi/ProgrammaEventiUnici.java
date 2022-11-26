package org.generation.italy.eventi;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ProgrammaEventiUnici {
	private String titolo; 
	private Set<Evento> eventi;
	
	public ProgrammaEventiUnici(String titolo) {
		setTitolo(titolo);
		setEventi();
	}
	
	public String getTitolo() {
		return titolo;
	}
	public void setTitolo(String titolo) {
		this.titolo = titolo;
	}
	public Set<Evento> getEventi() {
		return eventi;
	}
	public void setEventi() {
		this.eventi = new HashSet<>();
	}
	
	public void addEvento(Evento e) {
		eventi.add(e);
	}
	
	public Set<Evento> getEventiByData(LocalDate data) {
		Set<Evento> eventiByData = new HashSet<>();
		
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
		
		List<Evento> eventiList = new ArrayList<>(eventi);

		eventiList.sort((e1, e2) -> e1.getData().compareTo(e2.getData()));
		
		for (Evento e : eventiList) {
			listaFormattata += e.getDataFormattata() + " - " + e.getTitolo() + "\n";
		}
		
		return listaFormattata;
	}
	
	public Evento getMaxPostiTotaliEvento() {
		Evento maxPostiTotaliEvento = null;
		int maxPostiTotali = Integer.MIN_VALUE;
		
		for (Evento e : eventi) {
			if (e.getPostiTotale() > maxPostiTotali) {
				maxPostiTotali = e.getPostiTotale();
				maxPostiTotaliEvento = e;
			}
		}
		return maxPostiTotaliEvento;
	}
	
	public Evento getMinPostiTotaliEvento() {
		Evento minPostiTotaliEvento = null;
		int minPostiTotali = Integer.MAX_VALUE;
		
		for (Evento e : eventi) {
			if (e.getPostiTotale() < minPostiTotali) {
				minPostiTotali = e.getPostiTotale();
				minPostiTotaliEvento = e;
			}
		}
		return minPostiTotaliEvento;
	}
	
	public void orderedPrint() {
		List<Evento> eventiList = new ArrayList<>(eventi);
		eventiList.sort((e1, e2) -> e2.getTitolo().length() - e1.getTitolo().length());

		for (Evento e : eventiList) {
			System.out.println(e);
		}
	}
	
	@Override
	public String toString() {
		return getListaFormattata();
	}
}
