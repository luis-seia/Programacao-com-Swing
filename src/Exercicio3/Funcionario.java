package Exercicio3;

public abstract class Funcionario {
	// atributos
	private String name;
	private String numBi;
	private String Morada;
	private double salario;
	
	
	// gettres e setters 
	
	
	public String getName() {
		return name;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getNumBi() {
		return numBi;
	}
	public void setNumBi(String numBi) {
		this.numBi = numBi;
	}
	public String getMorada() {
		return Morada;
	}
	public void setMorada(String morada) {
		Morada = morada;
	}
	
	
	
}
