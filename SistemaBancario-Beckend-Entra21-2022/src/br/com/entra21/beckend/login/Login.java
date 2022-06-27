package br.com.entra21.beckend.login;

import java.util.ArrayList;
import java.util.Arrays;

import br.com.entra21.beckend.Armazenar;
import br.com.entra21.beckend.Menu;
import br.com.entra21.beckend.annotation.Informacao;
import br.com.entra21.beckend.cadastro.ContaFisicaCrud;
import br.com.entra21.beckend.cadastro.ContaJuridicaCrud;

@Informacao(value = "Chamada de Opcoes de Login")
public class Login extends Menu {
	
	ContaFisicaCrud contaFisicaCrud = new ContaFisicaCrud();
	
	ContaJuridicaCrud contaJuridicaCrud = new ContaJuridicaCrud();

	ArrayList<String> opcoes = new ArrayList<String>(Arrays.asList("| DADOS BANCARIOS |", "| DEPOSITO |", "| SACAR |",
			"| TRANSFERENCIA GREEN BANK |","| INVESTIMENTOS |", "| SALDO |"));

	public Login(String titulo, ArrayList<String> opcoes) {
		super(titulo, opcoes);
	}

	@Override
	public byte capturarOpcao() {

		byte opcao = super.capturarOpcao();

		switch (opcao) {

		case 2:
			contaFisicaCrud.listar(Armazenar.clientes);
			new MenuPrincipalPF("MENU PRINCIPAL", opcoes, ConfirmandoLogin.buscarCliente()).executarMenu();
			break;

		case 3:
			contaJuridicaCrud.listar(Armazenar.empresas);
			new MenuPrincipalPJ("MENU PRINCIPAL", opcoes, ConfirmandoLogin.buscarEmpresa()).executarMenu();
			break;

		default:
			break;
		}

		return opcao;
	}

}
