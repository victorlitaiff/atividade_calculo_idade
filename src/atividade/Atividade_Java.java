package atividade;

import java.util.*;

public class Atividade_Java {

	public static void main(String[] args) {
		int ano_atual = 2023;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite seu ano de nascimento:(AAAA)"); 
		int anoDeNascimento = sc.nextInt(); 
		
		int idade_atual = ano_atual - anoDeNascimento;
	
		System.out.println("Sua idade é " + idade_atual);
	} 

}
