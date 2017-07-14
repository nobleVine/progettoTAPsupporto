package com.lorenzo.marco.modello_cliente;

import static org.junit.Assert.*;

import org.junit.*;

public class ClienteTest {

	private Cliente cliente;

	@Test
	public void testNome() {
		this.cliente = creazioneCliente("Marco", "Vignini");
		assertEquals("Marco", this.cliente.getNome());
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void testNomeVuoto() {
		this.cliente = creazioneCliente("", "Vignini");
	}
	
	@Test
	public void testCognome() {
		this.cliente = creazioneCliente("Marco", "Vignini");
		assertEquals("Vignini", this.cliente.getCognome());
	}
	
	private Cliente creazioneCliente(String nome, String cognome) {
		return new Cliente(nome, cognome);
	}

}
