package Teste;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import Colecoes.AgendaEletronicaHashMap;
import Colecoes.AgendaEletronicaList;
import Colecoes.Contato;
import Colecoes.ContatoMap;

public class AgendaEletronicaMap {

	ContatoMap c1;
	ContatoMap c2;
	ContatoMap c3;
	AgendaEletronicaHashMap agenda;
	@Before
	public void setUp() throws Exception {
		c1 = new ContatoMap("98773834","Silvio@gmail.com");
		c2 = new ContatoMap("8732632","sil@hotmail.com");
		agenda = new AgendaEletronicaHashMap();
		agenda.adicionaContato("Silvio", c1);;
		agenda.adicionaContato("Silmara",c2);;
		
	}
	@Test
	public void testAddContato() {
		c3 = new ContatoMap("23421888","Ana@gmail.com");
		agenda.adicionaContato("Ana",c3);;
		assertEquals(3,agenda.getContatoMap());
	}
	@Test
	public void testRemoverContato() {
		assertTrue(agenda.removerContato("Silvio", c1));
	}

	@Test
	public void testRemoverContatoID() {
		agenda.removerContatoID("Silmara");
		assertEquals(1,agenda.getContatoMap());
	}
	@Test
	public void testListarContatos() {
		assertEquals(0,agenda.listarContatos("A").size()); 
		
	
	
	}

}
