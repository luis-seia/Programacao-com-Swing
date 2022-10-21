package Exercicio3;

public class AlunoTrabalhador extends Funcionario{
	private double pagamento;
	
	public double getPagamento() {
		return pagamento;
	}

	public void setPagamento(double horas) {
		if (horas<0 || horas>160) {
			throw new Excepcaohoras("horas de trabalho invalida");
		}
		this.setPagamento(this.getSalario()*horas);
	}
}
