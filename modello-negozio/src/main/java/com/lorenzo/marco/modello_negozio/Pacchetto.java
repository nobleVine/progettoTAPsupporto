package com.lorenzo.marco.modello_negozio;

import java.util.*;

public class Pacchetto {

	private String nome;
	private double prezzo;
	private String descrizione;
	private List<Prodotto> pacchetto;

	public Pacchetto(String nome, String descrizione) {
		controlloParametriPacchetto(nome, descrizione);
		this.pacchetto = new ArrayList<>();
	}

	public String getNome() {
		return nome;
	}

	public double getPrezzo() {
		for (int i = 0; i < pacchetto.size(); i++) {
			prezzo = prezzo + pacchetto.get(i).getPrezzo();
		}
		return prezzo;
	}

	public String getDescrizione() {
		return descrizione;
	}

	public List<Prodotto> getPacchetto() {
		return pacchetto;
	}

	public void aggiungiProdotto(Prodotto prodotto) {
		pacchetto.add(prodotto);
	}

	public int numProdotti() {
		return pacchetto.size();
	}

	public void rimuoviProdotto(Prodotto prodotto) {
		if (numProdotti() == 0)
			throw new RuntimeException("Non posso un prodotto da un pacchetto vuoto");
		pacchetto.remove(prodotto);
	}

	private void controlloParametriPacchetto(String nome, String descrizione) {
		if (nome == "" || nome == null) {
			throw new IllegalArgumentException("Il nome del pacchetto non può essere vuoto");
		} else {
			this.nome = nome;
		}

		if (descrizione == "" || descrizione == null) {
			throw new IllegalArgumentException("La descrizione del pacchetto non può essere vuoto");
		} else {
			this.descrizione = descrizione;
		}
	}
}
