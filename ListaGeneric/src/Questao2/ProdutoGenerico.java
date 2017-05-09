package Questao2;

public class ProdutoGenerico<T> {
    private Codigo<T> codigoProduto;
    private String descricao;
    private double preco;
    
	public ProdutoGenerico(Codigo<T> codigoProduto, String descricao, double preco) {
		this.codigoProduto= codigoProduto;
		this.descricao = descricao;
		this.preco = preco;
	}
	public Codigo<T> getCodigo() {
		return codigoProduto;
	}
	public String getDescricao() {
		return descricao;
	}
	public double getPreco() {
		return preco;
	}
	
	public String toString() {
		return "ProdutoG{ codigo= "+codigoProduto+" Descrição ="+descricao+" Preço ="+preco;
	}
	
    
}
