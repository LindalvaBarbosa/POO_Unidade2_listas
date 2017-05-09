package Teste;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

import Colecoes.AgendaEletronicaList;
import Colecoes.Contato;

public class AgendaEletronicaListTest {
	Contato c1;
	Contato c2;
	Contato c3;
	AgendaEletronicaList agenda;
	@Before
	public void setUp() throws Exception {
		c1 = new Contato("Mario","01010101","Zezinho@gmail.com");
		c2 = new Contato("Maria","02020202","Maria@hotmail.com");
		agenda = new AgendaEletronicaList();
		agenda.adicionarContato(c1);
		agenda.adicionarContato(c2);;
		
	}
	@Test
	public void testAddContato() {
		c3 = new Contato("Ana","23421","Ana@gmail.com");
		agenda.adicionarContato(c3);
		assertEquals(3,agenda.getContatos().size());
	}
	@Test
	public void testRemoverContatoContato() {
		assertTrue(agenda.removerContato(c2));
	}

	@Test
	public void testRemoverContatoID() {
		agenda.removerContato("M");
		assertEquals(0,agenda.getContatos().size());
	}

	@Test
	public void testListarContatos() {
		assertEquals(0,agenda.listarContatos("A").size());
	}

	
	
	

	
	

}
