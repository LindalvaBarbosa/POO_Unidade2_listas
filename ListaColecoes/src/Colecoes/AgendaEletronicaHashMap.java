package Colecoes;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;


public class AgendaEletronicaHashMap {
    Map<String, ContatoMap> mapa;
    
    public AgendaEletronicaHashMap(){
    	mapa = new HashMap<String, ContatoMap>();
    }
	
	public AgendaEletronicaHashMap(Map<String, ContatoMap> m){
		mapa = m;
	}
	
	public void adicionaContato(String nome, ContatoMap c){
		mapa.put(nome, c);
	}
	
	public boolean removerContato(String nome, ContatoMap c){
		return mapa.remove(nome, c);
	
	}
	
	public void removerContatoID(String id){
		@SuppressWarnings("rawtypes")
		Iterator i = mapa.entrySet().iterator();
		while(i.hasNext()){
			@SuppressWarnings("unchecked")
			Entry<String,ContatoMap> thisEntry = (Entry<String, ContatoMap>) i.next();
			String nome = (String) thisEntry.getKey();
			if(nome.contains(id)) i.remove();
		}
	}
	
	public List<ContatoMap> listarContatos(String id){
		List<ContatoMap> l = new ArrayList<ContatoMap> ();
		@SuppressWarnings("rawtypes")
		Iterator i = mapa.entrySet().iterator();
		while(i.hasNext()){
			@SuppressWarnings("unchecked")
			Entry <String, ContatoMap>thisEntry = (Entry<String, ContatoMap>) i.next();		
			String n = (String) thisEntry.getKey();
			ContatoMap c = (ContatoMap) thisEntry.getValue();
			if(n.contains(id)){
				l.add(c);
			}
		}
		return l;
	}
	
	public int getContatoMap(){
		return mapa.size();
	}
}
