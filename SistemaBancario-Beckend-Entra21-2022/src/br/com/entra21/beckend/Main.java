package br.com.entra21.beckend;

import java.time.Instant;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

import br.com.entra21.beckend.annotation.Informacao;

public class Main {

	private static Scanner input = new Scanner(System.in);
	private static ArrayList<String> opcoes;

	
	public static void main(String[] args) {
		
		Armazenar.gerarMassaTeste();
		gerarData();
		
		Instant start = Instant.now();

		byte option; // TODO 01 - Logica - Variaveis
		final byte ZERO = 0; // TODO 01 - Logica - Constante

		do { // TODO 01 Logica - do-while

			System.out.println(montarMenu());
			System.out.print("\tEscolha uma opcao: ");
			option = input.nextByte();

			switch (option) { // TODO 01 - Logica - Switch

			case ZERO:
				System.out.println("\n\t- Obrigado por usar o Green Bank, VOLTE SEMPRE!");
				break;

			case 1:
				Principal.login();
				break;

			case 2:
				Principal.cadastrar();
				break;
				
			case 3:
				Principal.alterarSenha();
				break;

			case 4:
				Principal.sobre();
				break;

			default:
				System.out.println("\n\t- Por favor, insira um opcao valida.");
				break;
			}
		} while (option != 0);
		
		TempoNoPrograma.fim(start);
	}

	public static String montarMenu() {
		if (opcoes == null) { //TODO 01 - Logica - IF
			opcoes = new ArrayList<>(Arrays.asList("| FECHAR APP |", "| ENTRAR CONTA GREEN |", "| CADASTRAR CONTA GREEN |", "| ALTERAR SENHA |", "| SOBRE |"));
		}
		String menu = "\n\t################| GREEN BANK |################\n";
		for (int opcao = 0; opcao < opcoes.size(); opcao++) { //TODO 01 - Logica - For
			menu += "\n\t" + (opcao) + " > " + opcoes.get(opcao);
		}
		menu += "\n\t______________________________________________\n";
		return menu;
	}

	@Informacao(value = "Gera Data Atual") //TODO 03 - Java Avancado - Dates
	public static void gerarData() {
		LocalDate hoje = LocalDate.now();
		DateTimeFormatter formatar = DateTimeFormatter.ofPattern("dd/MM/YYYY");
		System.out.println("\n\t" + formatar.format(hoje));
	}
}
