package Colecoes;

public class ContatoMap {
		private String numero;
		private String email;
		
		public ContatoMap(String num, String email){
			this.numero = num;
			this.email = email;
		}
		
		public String getNumero() {
			return numero;
		}
		
		public String getEmail() {
			return email;
		}
		

		@Override
		public boolean equals(Object o) {
			if(o == null){
				return false;
			}else if(o instanceof Contato){
				Contato c = (Contato) o;
				if(this.numero == c.getNumero() && this.email == c.getEmail()){
					return true;
				}
			}
			return false;
		}

		public String toString(){
			return "" + numero + " - " + email;  
			 
		}

}
