package exercicio3;

public class Main3 {
public static void main(String[] args) {
		
		Modelo modelo = new Modelo("Jo�o Barbosa Santana", "1.84", 82, 24);
		Ator ator = new Ator("Pedro Mascavo Oliveira", "1.77", 69, 36, 8);
		
		modelo.adicionarTrabalho("Malha��o 2000");
		modelo.mostrarDados();
		
		ator.adicionarTrabalho("Avenida Brasil");
		ator.mostrarDados();
	}
}