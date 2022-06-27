package br.com.entra21.beckend;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

import br.com.entra21.beckend.cadastro.ContaFisicaCrud;
import br.com.entra21.beckend.cadastro.ContaJuridicaCrud;
import br.com.entra21.beckend.modelos.Cliente;
import br.com.entra21.beckend.modelos.Empresa;

public class AlterarSenha extends Menu {

	private ContaFisicaCrud contaFisicaCrud = new ContaFisicaCrud();
	private ContaJuridicaCrud contaJuridicaCrud = new ContaJuridicaCrud();

	public AlterarSenha(String titulo, ArrayList<String> opcoes) {
		super(titulo, opcoes);
	}

	@Override
	public byte capturarOpcao() {

		byte opcao = super.capturarOpcao();

		switch (opcao) {

		case 2:
			contaFisicaCrud.listar(Armazenar.clientes);
			contaFisica(contaFisicaCrud.capturarChave());
			break;

		case 3:
			contaJuridicaCrud.listar(Armazenar.empresas);
			contaJuridica(contaJuridicaCrud.capturarChave());
			break;

		}

		return opcao;
	}

	public void contaFisica(Cliente cliente) {

		try { //TODO 03 - Java Avancado - Exceptions
			String senha;

			System.out.print("\n\t" + Armazenar.clientes.get(cliente.getCpf()).getNome() + " Informe a Senha: ");
			senha = super.getInput().next();

			if (Armazenar.clientes.get(cliente.getCpf()).getSenha().equals(senha)) {

				String senha1, senha2;

				System.out.print("\n\t" + Armazenar.clientes.get(cliente.getCpf()).getNome() + " Informe Nova Senha: ");
				senha1 = super.getInput().next();
				System.out.print(
						"\t" + Armazenar.clientes.get(cliente.getCpf()).getNome() + " Informe Novamente Senha: ");
				senha2 = super.getInput().next();
				if (senha1.equals(senha2)) {
					Armazenar.clientes.get(cliente.getCpf()).setSenha(senha2);
					System.out.println("\n\t-Senha Alterada com Sucesso-");
				} else { //TODO 01 - Logica - IF/ELSE
					System.out.println("\t-Senha Diferente Tente Novamente-");
				}

			} else {
				System.out.println("\t-Senha Incorreta-");
			}
		} catch (NullPointerException e) {
			System.out.println("\t-Cliente não Localizado Tente Novamente-");
		}
	}

	public void contaJuridica(Empresa empresa) {

		try {
			String senha;

			System.out.print("\n\t" + Armazenar.empresas.get(empresa.getCnpj()).getNome() + " Informe a Senha: ");
			senha = super.getInput().next();

			if (Armazenar.empresas.get(empresa.getCnpj()).getSenha().equals(senha)) {

				String senha1, senha2;

				System.out
						.print("\n\t" + Armazenar.empresas.get(empresa.getCnpj()).getNome() + " Informe Nova Senha: ");
				senha1 = super.getInput().next();
				System.out.print(
						"\t" + Armazenar.empresas.get(empresa.getCnpj()).getNome() + " Informe Novamente Senha: ");
				senha2 = super.getInput().next();
				if (senha1.equals(senha2)) {
					Armazenar.empresas.get(empresa.getCnpj()).setSenha(senha2);
					System.out.println("\n\t-Senha Alterada com Sucesso-");
				} else {
					System.out.println("\t-Senha Diferente Tente Novamente-");
				}

			} else {
				System.out.println("\t-Senha Incorreta-");
			}
		} catch (NullPointerException e) {
			System.out.println("\t-Empresa não Localizado Tente Novamente-");
		}

	}
}
