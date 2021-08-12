package exercicio3;


public class Ator extends Modelo{
	
	
	      private int nivelAtor;

	  	public Ator(String nome, String altura, double peso, int idade, int nivelAtor) {
	  		super(nome, altura, peso, idade);
	  		this.nivelAtor = nivelAtor;
	  	}

	  	public int getNivelAtor() {
	  		return nivelAtor;
	  	}

	  	public void setNivelAtor(int nivelAtor) {
	  		this.nivelAtor = nivelAtor;
	  	}
	  	
	  	@Override
	  	public void mostrarDados() {
	  		System.out.println(getNome() + " (apenas Novela)\n"
	  				+ "Trabalhos: " + getTrabalhos() + "\n");
	  	}
	}