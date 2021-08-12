package exercicio4;

import java.util.Scanner;

public class Tabelamoto {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		double valorMoto = 0;
		
		double precoAVista = 0;
		
		double precoFinal_5parcelas = 0;
		double precoUnitario_5parcelas = 0;
		
		double precoFinal_11parcelas = 0;
		double precoUnitario_11parcelas = 0;
		
		double precoFinal_17parcelas = 0;
		double precoUnitario_17parcelas = 0;
		
		double precoFinal_23parcelas = 0;
		double precoUnitario_23parcelas = 0;
		
		double precoFinal_29parcelas = 0;
		double precoUnitario_29parcelas = 0;
		
		System.out.print("Digite o valor da moto: ");
		valorMoto = scan.nextDouble();

		precoAVista = valorMoto * 0.7;
		
		precoFinal_5parcelas = valorMoto + (valorMoto * 0.04);
		precoUnitario_5parcelas = precoFinal_5parcelas / 5;
		
		precoFinal_11parcelas = valorMoto + (valorMoto * 0.07);
		precoUnitario_11parcelas = precoFinal_11parcelas / 11;
		
		precoFinal_17parcelas = valorMoto + (valorMoto * 0.10);
		precoUnitario_17parcelas = precoFinal_17parcelas / 17;
		
		precoFinal_23parcelas = valorMoto + (valorMoto * 0.13);
		precoUnitario_23parcelas = precoFinal_23parcelas / 23;
		
		precoFinal_29parcelas = valorMoto + (valorMoto * 0.16);
		precoUnitario_29parcelas = precoFinal_29parcelas / 29;
		
		System.out.println("\nPreço final (arredondado) --- Quantidade de parcelas --- Valor da parcela");
		System.out.printf("R$ %.2f                 ---      À vista           ---       N/A\n", precoAVista);
		System.out.printf("R$ %.2f                ---         5              ---    R$ %.2f\n", precoFinal_5parcelas, precoUnitario_5parcelas);
		System.out.printf("R$ %.2f                ---         11             ---    R$ %.2f\n", precoFinal_11parcelas, precoUnitario_11parcelas);
		System.out.printf("R$ %.2f                ---         17             ---    R$ %.2f\n", precoFinal_17parcelas, precoUnitario_17parcelas);
		System.out.printf("R$ %.2f                ---         23             ---    R$ %.2f\n", precoFinal_23parcelas, precoUnitario_23parcelas);
		System.out.printf("R$ %.2f                ---         29             ---    R$ %.2f\n", precoFinal_29parcelas, precoUnitario_29parcelas);
		
		scan.close();

	}

}