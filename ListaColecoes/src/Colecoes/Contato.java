package Colecoes;

public class Contato {
	private String nome;
	private String numero;
	private String email;
	public Contato(String nome, String numero, String email) {
		this.nome = nome;
		this.numero = numero;
		this.email = email;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	@Override
	public boolean equals(Object o) {
		if(o == null){
			return false;
		}else if(o instanceof Contato){
			Contato c = (Contato) o;
			if(this.nome == c.getNome() && this.numero == c.getNumero() && this.email == c.getEmail()){
				return true;
			}
		}
		return false;
	}
	public int compareTo(Contato c){
		if(this.nome == c.getNome() && email == c.getEmail() && numero == c.getNumero()){
			return 0;
		}else{
			return -1;
		}
	}

}
