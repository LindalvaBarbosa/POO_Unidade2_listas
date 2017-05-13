package Teste;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import Colecoes.AgendaEletronicaList;
import Colecoes.AgendaEletronicaSet;
import Colecoes.Contato;

public class AgendaEletronicaSetTest {

	Contato c1;
	Contato c2;
	Contato c3;
	AgendaEletronicaSet agenda;
	@Before
	public void setUp() throws Exception {
		c1 = new Contato("Silvio","98773834","Silvio@gmail.com");
		c2 = new Contato("Maria","8732632","Maria@hotmail.com");
		agenda = new AgendaEletronicaSet();
		agenda.adicionarContato(c1);
		agenda.adicionarContato(c2);;
		
	}
	@Test
	public void testAddContato() {
		c3 = new Contato("Elisa","23421","elisa23@gmail.com");
		agenda.adicionarContato(c3);
		assertEquals(3,agenda.getContatos());
	}
	@Test
	public void testRemoverContatoContato() {
		assertTrue(agenda.removerContato(c1));
	}

	@Test
	public void testRemoverContatoID() {
		agenda.removerContatoID("M");
		assertEquals(0,agenda.getContatos());
	}

	@Test
	public void testListarContatos() {
		assertEquals(0,agenda.listarContatos("E").size());
	}


}
