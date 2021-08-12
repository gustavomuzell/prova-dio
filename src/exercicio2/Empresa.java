package exercicio2;

public class Empresa {
	
public static void main(String[] args) {
	
	Funcionario f1 = new Funcionario("Joao","estagio", 850);
	Funcionario f2 = new Funcionario("Andressa","junior", 1200);
	Funcionario f3 = new Funcionario("maria", "senior", 2590);
	
	f1.setarCargoSalario();
	f2.setarCargoSalario();
	f3.setarCargoSalario();
	
	f1.metodoTrabalho();
	f2.metodoTrabalho();
	f3.metodoTrabalho();
	
	System.out.println(f1);
	System.out.println(f2);
	System.out.println(f3);
	
}


}


