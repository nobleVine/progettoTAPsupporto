package com.lorenzo.marco.carrello;

import java.util.ArrayList;
import java.util.List;

import com.lorenzo.marco.prodotti.ProdottoGenerico;

public class Carrello {

	private List<ProdottoGenerico> listaDellaSpesa;

	public Carrello() {
		this.listaDellaSpesa = new ArrayList<>();
	}

	public void aggiungiAlCarrello(ProdottoGenerico prodottoGenerico) {
		this.listaDellaSpesa.add(prodottoGenerico);
	}

	public void rimuoviDalCarrello(ProdottoGenerico prodottoGenerico) {
		if (this.listaDellaSpesa.isEmpty())
			throw new IllegalArgumentException("Carrello vuoto");
		this.listaDellaSpesa.remove(prodottoGenerico);
	}

	public int lunghezzaCarrello() {
		return this.listaDellaSpesa.size();
	}

	public double spesaTotale() {
		int prezzoSpesa = 0;
		for (int i = 0; i < this.lunghezzaCarrello();i++ ) {
			prezzoSpesa += this.listaDellaSpesa.get(i).getPrezzo();
		}
		return prezzoSpesa;
	}

}
