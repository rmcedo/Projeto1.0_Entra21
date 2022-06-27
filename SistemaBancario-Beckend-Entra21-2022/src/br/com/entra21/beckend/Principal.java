package br.com.entra21.beckend;

import java.util.ArrayList;
import java.util.Arrays;

import br.com.entra21.beckend.annotation.Informacao;
import br.com.entra21.beckend.annotation.Responsavel;
import br.com.entra21.beckend.cadastro.Cadastros;
import br.com.entra21.beckend.login.Login;

@Informacao(value = "Gera meus SubMenus")
public class Principal {
	
	@Informacao(value = "Faz o Login")
	public static void login() {
		new Login("LOGIN ", new ArrayList<String>(Arrays.asList("| ENTRAR CONTA PF |", "| ENTRAR CONTA PJ |"))).executarMenu();
	}

	@Informacao(value = "Faz o Cadastro")
	public static void cadastrar() {
		new Cadastros("CADASTRO ", new ArrayList<String>(Arrays.asList("| CADASTRAR CONTA PF |", "| CADASTRAR CONTA PJ |"))).executarMenu();
	}

	@Responsavel (
					ordemDePrioridade = Responsavel.OrdemDePrioridade.IMPORTANTE,
					toDo = "Adicionar m�todo de atualiza��o de senha.",
					responsavel = "Arthur"
	)
	public static void alterarSenha() {
		new AlterarSenha("ALTERAR SENHA", new ArrayList<String>(Arrays.asList("| ALTERAR SENHA PF |", "| ALTERAR ENTRAR SENHA PJ |"))).executarMenu();;
	}
	
	@Informacao(value = "Informacoes do Projeto")
	public static void sobre() {
		
		System.out.println("\t____________________________________________________________________________________\n");

		System.out.println("\t\t ######################| SOBRE O GREEN BANK |######################\n");
		
		System.out.println("\n\t\t\t\t       Integrantes | Funcoes");
		System.out.println("\t\t\t\t       ---------------------\n");

		ArrayList<String> nomes = new ArrayList<>(); //TODO 03 - Java Avancado - Lambda
		nomes.add(new String("\tThabata Santos - Git | Documenta��o"));
		nomes.add(new String("\tRafael Macedo - Main | Menus")); 
		nomes.add(new String("\tErick Gabriel - CR-(UD) Read | Creat"));
		nomes.add(new String("\tArthur Estevan - CR-(UD) Update | Delete"));
		nomes.sort(String::compareTo);
		nomes.forEach(System.out::println);
		
		System.out.println("\t____________________________________________________________________________________\n");
		
		System.out.println("\tO Green Bank surgiu a partir do Projeto Entra 21 - Java -> Turma do Prof. Oliota\n");

		System.out.println("\tResumo - Implementacao do Sistema com a geracao de uma Regra de Negocios.");
		
		System.out.println("\n\t## Foram utilizado todos os topicos e assuntos dentro do curso de Java ##");
		System.out.println("\t____________________________________________________________________________________\n");
	}

}
