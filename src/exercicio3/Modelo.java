package exercicio3;

import java.util.ArrayList;
import java.util.List;

public class Modelo {

	
private String nome;
private String altura;
private double peso;
private int idade;
private List<String> trabalhos = new ArrayList<>();

public Modelo(String nome, String altura, double peso, int idade) {
	this.nome = nome;
	this.altura = altura;
	this.peso = peso;
	this.idade = idade;
}

public String getNome() {
	return nome;
}

public void setNome(String nome) {
	this.nome = nome;
}

public String getAltura() {
	return altura;
}

public void setAltura(String altura) {
	this.altura = altura;
}

public double getPeso() {
	return peso;
}

public void setPeso(double peso) {
	this.peso = peso;
}

public int getIdade() {
	return idade;
}

public void setIdade(int idade) {
	this.idade = idade;
}

public List<String> getTrabalhos() {
	return trabalhos;
}

public void adicionarTrabalho(String trabalho) {
	trabalhos.add(trabalho);
}

public void mostrarDados() {
	System.out.println(this.nome + " (apenas Malhação)\n"
			+ "Trabalhos: " + getTrabalhos() + "\n");
}
}