package Colecoes;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class AgendaEletronicaList {

	List<Contato> c =  new ArrayList<Contato>();
	
	
	
	public void adicionarContato(Contato cont){
		c.add(cont);
		
	}
	public boolean removerContato(Contato cont){
		boolean b= false;
		Iterator<Contato> i = c.iterator();
		while (i.hasNext()) {
			Contato c1 = i.next();
			if(c1.equals(cont)){
				i.remove();
				return true;
			}
			
		}
		return b;
		
	}
	public void removerContato(String id){
		Iterator<Contato> i = c.iterator();
		while (i.hasNext()) {
			Contato c1 = i.next();
			if(c1.getNome().contains(id)){
				i.remove();
			}
		}	
			
		
	}
	public List<Contato> listarContatos(String id){
		List<Contato> aux = new ArrayList<>();
		Iterator<Contato> i = c.iterator();
		while (i.hasNext()) {
			Contato c1 = i.next();
			if(c1.getNome().contains(id)){
				aux.add(c1);
			}
		}
		return aux;
	}
	public List<Contato> getContatos(){
		return c;
	}
	

}
