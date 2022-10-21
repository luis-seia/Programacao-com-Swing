package exercicio7;

public class Conta {
	private String titular;
	private double saldo;
	private String nuit;
	private double limite;
	
	
	
	
	// getters e  setters
	public String getTitular() {
		return titular;
	}
	public void setTitular(String titular) {
		this.titular = titular;
	}
	public double getSaldo() {
		return saldo;
	}

	public String getNuit() {
		return nuit;
	}
	public void setNuit(String nuit) {
		this.nuit = nuit;
	}
	
	
	
	// metodos
	public double getLimite() {
		return limite;
	}
	public void setLimite(double limite) {
		this.limite = limite;
	}
	
	public void depositar(double valor) {
		this.saldo += valor;
		
	}
	
	public void saca(double valor){
		if (valor>this.saldo || valor <0 || valor>this.limite) {
			throw new ContaExcepcao("operacao nao efectuada");
		}
		this.saldo-=valor;
	}
	
	
	

}
