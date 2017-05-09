package Questao2;

public class ProdutoGenerico2<T,U,E> {
	private T codigo;
	private String descricao;
	private U preco;
	private E valorMonetarioProd;
	
	
	public ProdutoGenerico2(T codigo, String descricao, U preco, E valorMonetarioProd) {
		this.codigo = codigo;
		this.descricao = descricao;
		this.preco = preco;
		this.valorMonetarioProd = valorMonetarioProd;
	}
	public T getCodigo() {
		return codigo;
	}
	public void setCodigo(T codigo) {
		this.codigo = codigo;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public U getPreco() {
		return preco;
	}
	public void setPreco(U preco) {
		this.preco = preco;
	}
	public E getValorMonetarioProd() {
		return valorMonetarioProd;
	}
	public void setValorMonetarioProd(E valorMonetarioProd) {
		this.valorMonetarioProd = valorMonetarioProd;
	}

}
