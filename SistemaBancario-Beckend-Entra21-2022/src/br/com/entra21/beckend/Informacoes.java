package br.com.entra21.beckend;

import java.util.ArrayList;

public class Informacoes {

	public static void sobre() {
		
		System.out.println("\t____________________________________________________________________________________\n");

		System.out.println("\t\t ######################| SOBRE O GREEN BANK |######################\n");
		
		System.out.println("\n\t\t\t\t       Integrantes | Funcoes");
		System.out.println("\t\t\t\t       ---------------------\n");

		ArrayList<String> nomes = new ArrayList<>(); //TODO 03 -Java Avançado - Lambda
		nomes.add(new String("\tThabata Santos - Git | Documenta��o"));
		nomes.add(new String("\tRafael Macedo - Main | Menus")); 
		nomes.add(new String("\tErick Gabriel - CR-(UD) Read | Creat"));
		nomes.add(new String("\tArthur Estevan - CR-(UD) Update | Delete"));
		nomes.sort(String::compareTo);
		nomes.forEach(System.out::println);
		
		System.out.println("\t____________________________________________________________________________________\n");
		
		System.out.println("\tO Green Bank surgiu a partir do Projeto Entra 21 - Java -> Turma do Prof. Oliota\n");

		System.out.println("\tResumo - Implementacao do Sistema com a geracao de uma Regra de Negocios.");
		
		System.out.println("\n\t## Foram utilizado todos os tipicos e assuntos dentro do curso de Java ##");
		System.out.println("\t____________________________________________________________________________________\n");
	}

}
