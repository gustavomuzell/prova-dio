package exercicio2;

public class Funcionario {
	
	private String nome;
	private String cargo;
	private double salario;
	
	public Funcionario() {
		
	}
	
	public Funcionario(String nome, String cargo, double salario) {
		this.nome = nome;
		this.cargo = cargo;
		this.salario = salario;
	}
	
	public void setarCargoSalario() {
		if(getCargo().equalsIgnoreCase("estagio")) {
			setSalario(800.00);
		}if (getCargo().equalsIgnoreCase("junior")) {
			setSalario(1200.00);
		}if(getCargo().equalsIgnoreCase("senior")) {
			setSalario(2500.00);
		} 
	}
	
	public void metodoTrabalho() {
		if(cargo.equalsIgnoreCase("estagio")) {
			System.out.println("estagiario é 100% home office");
		}else if (cargo.equalsIgnoreCase("junior")) {
			System.out.println("junior é presencial");
		} else if(cargo.equalsIgnoreCase("senior")) {
			System.out.println("senior é hibrido");
		} else {
			System.out.println("Não existe este cargo na empresa");
		}
	}
	
	@Override
	public String toString() {
		return "O funcionario".concat(nome) + " - cargo: ".concat(cargo) + " salário: R$ " + salario;
	}
	
	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public String getCargo() {
		return cargo;
	}
	public double getSalario() {
		return salario;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	
}


