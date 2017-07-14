package com.lorenzo.marco.modello_cliente;

public class Cliente {

	private String nome;
	private String cognome;
	
	public Cliente(String nome, String cognome) {
		controlloParametriDiInizializzazioneCliente(nome, cognome);
	}

	public String getNome() {
		return nome;
	}

	public String getCognome() {
		return cognome;
	}
	
	private void controlloParametriDiInizializzazioneCliente(String nome, String cognome) {
		if (nome != "" || nome == null) {
			this.nome = nome;
		} else {
			throw new IllegalArgumentException("Il nome del cliente non può essere vuoto");
		}

		if (cognome != "" || cognome == null) {
			this.cognome = cognome;
		} else {
			throw new IllegalArgumentException("Il cognome del cliente non può essere vuoto");
		}
	}

}
