package Preparacao;

public class Product {
	private String numero;
	private String referencia;
	private String custo;
	private String venda;
	private String lucro;
	private String descricao;
	
	
	public Product(String numero, String referencia,String descricao, String custo, String lucro, String venda ) {
		this.numero = numero;
		this.referencia = referencia;
		this.custo = custo;
		this.venda = venda;
		this.lucro = lucro;
		this.descricao = descricao;
	}


	public String getNumero() {
		return numero;
	}


	public void setNumero(String numero) {
		this.numero = numero;
	}


	public String getReferencia() {
		return referencia;
	}


	public void setReferencia(String referencia) {
		this.referencia = referencia;
	}


	public String getCusto() {
		return custo;
	}


	public void setCusto(String custo) {
		this.custo = custo;
	}


	public String getVenda() {
		return venda;
	}


	public void setVenda(String venda) {
		this.venda = venda;
	}


	public String getLucro() {
		return lucro;
	}


	public void setLucro(String lucro) {
		this.lucro = lucro;
	}


	public String getDescricao() {
		return descricao;
	}


	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}


