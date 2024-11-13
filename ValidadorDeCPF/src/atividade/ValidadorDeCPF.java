package atividade;

import java.util.Scanner;

public class ValidadorDeCPF {

	public static void main(String[] args) {
		int[] digitos = new int[11];
		int i, soma, peso;
		long cpf;
		boolean val;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite o seu objeto CPF: ");
		cpf = sc.nextLong();
		
		sc.close();
		
		for(i=10; i>=0; i--) {
			digitos[i]=(int)(cpf % 10);
			cpf /= 10;
		}
		
		for(i=0; i<=10; i++) {
			System.out.print(digitos[i] + " ");
		}
		
		soma=0;
		peso=10;
		for(i=0; i<9; i++) {
			soma+=digitos[i]*peso;
			peso--;
		}
		int digito1 = 11 - (soma%11);
		if(digito1 >= 10) {
			digito1 = 0;
		}
		
		soma=0;
		peso=11;
		for(i=0; i<10; i++) {
			soma+=digitos[i]*peso;
			peso--;
		}
		int digito2 = 11 - (soma % 11);
		if(digito2 >= 10) {
			digito2 = 0;
		}
		
		if(digito1==digitos[9] && digito2==digitos[10]) {
			System.out.println("\n\nCPF Válido");
			val = true;
		}
		else {
			System.out.println("\n\nCPF Inválido");
			val = false;
		}
		
		if (val == true) {
			switch (digitos[8]) {
			case 0:
				System.out.println("\nA pessoa nasceu em:\nRIO GRANDE DO SUL");
			break;
			case 1:
				System.out.println("\nA pessoa nasceu em:\nDISTRITO FEDERAL, GOIÁS, MATO GROSSO, MATO GROSSO DO SUL ou TOCANTINS");
			break;
			case 2:
				System.out.println("\nA pessoa nasceu em:\nPARÁ, AMAZONAS, ACRE, AMAPÁ, RONDÔNIA ou RORAIMA");
			break;
			case 3:
				System.out.println("\nA pessoa nasceu em:\nCEARÁ, MARANHÃO ou PIAUÍ");
			break;
			case 4:
				System.out.println("\nA pessoa nasceu em:\nPERNAMBUCO, RIO GRANDE DO NORTE, PARAÍBA ou ALAGOAS");
			break;
			case 5:
				System.out.println("\nA pessoa nasceu em:\nBAHIA ou SERGIPE");
			break;
			case 6:
				System.out.println("\nA pessoa nasceu em:\nMINAS GERAIS");
			break;
			case 7:
				System.out.println("\nA pessoa nasceu em:\nRIO DE JANEIRO ou ESPÍRITO SANTO");
			break;
			case 8:
				System.out.println("\nA pessoa nasceu em:\nSÃO PAULO");
			break;
			case 9:
				System.out.println("\nA pessoa nasceu em:\nPARANÁ ou SANTA CATARINA");
			break;
			}

		}
			
	}

}

