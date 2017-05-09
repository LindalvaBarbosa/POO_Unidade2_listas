package Colecoes;

import java.util.Iterator;
import java.util.List;
import java.util.TreeSet;

public class AgendaEletronicaSet {
	TreeSet<Contato> c = new TreeSet<>();
	
	public void adicionarContato(Contato cont){
		c.add(cont);
		
	}
	public boolean removerContato(Contato cont){
		boolean b = false;
		Iterator<Contato> i = c.iterator();
		while (i.hasNext()) {
			Contato c1 = i.next();
			if(c1.compareTo(cont)== -1){
				i.remove();
				return true;
			}
			
		}
		return b;
		
	}
	public void removerContatoID(String id){
		Iterator<Contato> i = c.iterator();
		while (i.hasNext()) {
			Contato c1 = i.next();
			if(c1.getNome().contains(id)){
				i.remove();
			}
		}	
			
		
	}
	public TreeSet<Contato> listarContatos(String id){
		TreeSet <Contato> aux = new TreeSet<>();
		for(Contato cont1 : c){
			if(cont1.getNome().contains(id)){
				c.add(cont1);
		    }
		}	
		return aux;	
}
	public int getContatos(){
		return c.size();
	}
}
