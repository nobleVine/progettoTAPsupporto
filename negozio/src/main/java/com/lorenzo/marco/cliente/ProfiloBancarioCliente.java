package com.lorenzo.marco.cliente;

import com.lorenzo.marco.carrello.Carrello;

public class ProfiloBancarioCliente {

	private Cliente cliente;
	private int idConto;
	private double saldo;

	public ProfiloBancarioCliente(Cliente cliente, int idConto, int saldo) {
		this.controlloParametri(cliente, idConto, saldo);
	}

	public Cliente getCliente() {
		return cliente;
	}

	public int getIdConto() {
		return idConto;
	}

	public double getSaldo() {
		return saldo;
	}
	
	private void controlloParametri(Cliente cliente, int idConto, int saldo) {
		if (cliente == null || idConto <= 0 || saldo <= 0)
			throw new IllegalArgumentException("Nessun parametro del conto bancario può essere null o minore uguale di zero");
		this.cliente = cliente;
		this.idConto = idConto;
		this.saldo = saldo;
	}

	public double pagamento(Carrello carrello) {
		if (getSaldo() < carrello.spesaTotale())
			throw new IllegalArgumentException("Non hai abbastanza soldi");
		setSaldo(getSaldo() - carrello.spesaTotale());
		return getSaldo();
	}

	private void setSaldo(double saldo) {
		this.saldo = saldo;
	}

}
