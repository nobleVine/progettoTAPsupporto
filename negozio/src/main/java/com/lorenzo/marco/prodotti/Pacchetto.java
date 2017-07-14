package com.lorenzo.marco.prodotti;
import java.util.*;

public class Pacchetto extends ProdottoGenerico {

	private List<Prodotto> listaProdottiSingoli;

	public Pacchetto(String nome, String descrizione) {
		super(nome, descrizione);
		controlloParametriProdotti(nome, descrizione);
		this.listaProdottiSingoli = new ArrayList<>();
	}

	public double getPrezzo() {
		for (int i = 0; i < listaProdottiSingoli.size(); i++) {
			prezzo = prezzo + listaProdottiSingoli.get(i).getPrezzo();
		}
		return prezzo;
	}

	public List<Prodotto> getListaProdottiSingoli() {
		return listaProdottiSingoli;
	}

	public void aggiungiProdotto(Prodotto prodotto) {
		listaProdottiSingoli.add(prodotto);
	}

	public int numProdotti() {
		return listaProdottiSingoli.size();
	}

	public void rimuoviProdotto(Prodotto prodotto) {
		if (numProdotti() == 0)
			throw new RuntimeException("Non posso un prodotto da un pacchetto vuoto");
		listaProdottiSingoli.remove(prodotto);
	}

	@Override
	public void controlloPrezzo(double prezzo) {
		//Controllo sul prezzo non necessario
	}

}