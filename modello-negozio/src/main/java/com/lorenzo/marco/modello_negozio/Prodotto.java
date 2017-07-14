package com.lorenzo.marco.modello_negozio;

public class Prodotto {

	private String nome;
	private double prezzo;
	private String descrizione;

	public Prodotto(String nome, double prezzo, String descrizione) {
		controlloParametriProdotto(nome, prezzo, descrizione);
	}

	public String getNome() {
		return nome;
	}

	public double getPrezzo() {
		return prezzo;
	}

	public String getDescrizione() {
		return descrizione;
	}

	private void controlloParametriProdotto(String nome, double prezzo, String descrizione) {
		if (nome == "" || nome == null) {
			throw new IllegalArgumentException("Il nome del prodotto non può essere vuoto");
		} else {
			this.nome = nome;
		}

		if (prezzo > 0) {
			this.prezzo = prezzo;
		} else {
			throw new IllegalArgumentException("Il prezzo minimo deve essere maggiore di zero");
		}

		if (descrizione == "" || descrizione == null) {
			throw new IllegalArgumentException("La descrizione del prodotto non può essere vuoto");
		} else {
			this.descrizione = descrizione;
		}
	}
}
