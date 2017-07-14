package com.lorenzo.marco.modello_negozio;

import static org.junit.Assert.*;

import org.junit.*;

public class ProdottoTest {

	private Prodotto prodotto;

	@Test
	public void testNome() {
		prodotto = creazioneProdotto("Maglietta", 1, null);
		assertEquals("Maglietta", prodotto.getNome());
	}
	
	@Test
	public void testPrezzo() {
		prodotto = creazioneProdotto(null, 50, null);
		assertEquals(50, prodotto.getPrezzo(), 0);
	}
	
	@Test
	public void testDescrizione() {
		prodotto = creazioneProdotto(null, 1, "Maglietta Lebron");
		assertEquals("Maglietta Lebron", prodotto.getDescrizione());
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void testNegativeInput() {
		prodotto = creazioneProdotto(null, -9, null);
	}


	private Prodotto creazioneProdotto(String nome, double prezzo, String descrizione) {
		return new Prodotto (nome, prezzo, descrizione);
	}

}
