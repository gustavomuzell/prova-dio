package exercicio1;

import java.util.Scanner;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class ControleDeVacina {public static void main(String[] args) {
	
	Scanner scan = new Scanner(System.in);
	String nomeVacina;
	String data;
	DateTimeFormatter parser = DateTimeFormatter.ofPattern("dd/MM/uuuu");
	
	System.out.print("Digite o nome da vacina: ");
	nomeVacina = scan.next();
	
	System.out.print("Digite a data que você tomou a primeira dose (dd/MM/aaaa): ");
	data = scan.next();
	
	LocalDate dataPrimeiraDose = LocalDate.parse(data, parser);
	LocalDate dataSegundaDose = dataPrimeiraDose.plusDays(14);
	
	if ("Janssem".equalsIgnoreCase(nomeVacina)) {
		System.out.println("Você tomou a vacina da Janssem no dia " + dataPrimeiraDose.format(parser) + " de dose ÚNICA");
	} else if ("Coronavac".equalsIgnoreCase(nomeVacina)) {
		System.out.println("Você tomou a vacina da Coronavac no dia " + dataPrimeiraDose.format(parser) + " e a segunda dose "
				+ "deve ser tomada no dia " + dataSegundaDose.format(parser));
	} else {
		System.out.println("Não identificamos qual o nome da vacina. Por favor, tente novamente!");
	}
	
	scan.close();
}
}