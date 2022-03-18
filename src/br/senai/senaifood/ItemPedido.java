package br.senai.senaifood;

public class ItemPedido {

	private Produto produto;
	private int quantidade;
	private String comentário;
	
	public ItemPedido() {
		
	}

	public Produto getProduto() {
		return produto;
	}

	public void setProduto(Produto produto) {
		this.produto = produto;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	public String getComentário() {
		return comentário;
	}

	public void setComentário(String comentário) {
		this.comentário = comentário;
	}

}
