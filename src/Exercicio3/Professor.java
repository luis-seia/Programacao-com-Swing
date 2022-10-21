package Exercicio3;

public class Professor extends Funcionario{
	
	
	
	public void setSalario(double salario) {
		if(salario<0) {
			throw new ExcepcaoSalario("Salario invalido");
		}
		
	}
		
		
}
