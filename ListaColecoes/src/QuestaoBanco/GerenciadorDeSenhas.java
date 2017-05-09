package QuestaoBanco;

import java.util.ArrayList;
import java.util.List;

public class GerenciadorDeSenhas {
	Senha s;
	private boolean prioridadePorIdade;
    List<String> fila = new ArrayList<>();
	public void setPrioridadePorIdade(boolean prioridadePorIdade) {
		this.prioridadePorIdade = prioridadePorIdade;
	}
	public List emitirSenha(Senha s){
		List<String> idosos = new ArrayList<>();
		List<String> ordemCheg = new ArrayList<>();
		int i = 1;
		int o = 1;
		if(s.getIdade() >= 60){
			this.prioridadePorIdade = true;
			idosos.add("p0"+String.valueOf(i)+s.getNome());
			i += 1;
		}else{
			ordemCheg.add("n0"+i);
			o +=1;
		}
		fila.add(idosos.get(i-1));
		fila.add(ordemCheg.get(i-1));
		return fila;
	}
	
	

}
