package br.com.entra21.beckend.login;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

import br.com.entra21.beckend.Armazenar;
import br.com.entra21.beckend.Menu;
import br.com.entra21.beckend.annotation.Informacao;
import br.com.entra21.beckend.modelos.Cliente;
import br.com.entra21.beckend.modelos.Empresa;

@Informacao(value = "Login de Contas Juridica")
public class MenuPrincipalPJ extends Menu implements OperacoesBancarias {
	
	static Scanner input = new Scanner(System.in);
	static HashMap<String, Empresa> empresas = new Armazenar().empresas;
	static LocalDate dataOperacoes = LocalDate.now();
	private Empresa empresa;
	private double saldo;
	
	@Informacao(value = "Login de Contas Juridica")
	public MenuPrincipalPJ(String titulo, ArrayList<String> opcoes, Empresa empresa) {
		super("EMPRESAS", opcoes);
		this.empresa = empresa;
	}

	@Override
	public byte capturarOpcao() {

		byte opcao = super.capturarOpcao();

		switch (opcao) {

		case 2:
			dadosBancario();
			break;

		case 3:
			deposito(capturandoValor());
			break;

		case 4:
			sacar(capturandoValor());
			break;

		case 5:
			transferencia(capturandoValor());
			break;

		case 6:
			investimento();
			break;

		case 7:
			saldo();
			break;

		default:
			System.out.println("\n\tPor favor, insira um opcao valida");
			break;
		}

		return opcao;
	}

	@Override
	public void dadosBancario() {
		System.out.println(empresa.toString());
	}

	@Override
	public void deposito(double pValor) {
		System.out.println("\n\t___| REALIZANDO DEPOSITO |___");
		System.out.println("\t-Saldo Anterior: " + this.saldo);
		this.saldo += pValor;
		empresa.setSaldo(this.saldo);
		System.out.println("\t-Saldo Posterior: " + this.saldo);
		System.out.println("\t_______| Fim Deposito |______");	
	}

	@Override
	public void sacar(double pValor) {
		System.out.println("\n\t___| REALIZANDO SAQUE |___");
		System.out.println("\t-Saldo Anterior: " + this.saldo);
		if (pValor <= this.saldo) {
			this.saldo -= pValor;
			empresa.setSaldo(this.saldo);
		} else {
			System.out.println("\t-Saldo Insuficente");
		}
		System.out.println("\t-Saldo Posterior: " + this.saldo);
		System.out.println("\t_______| FIM SAQUE |______");
	}

	@Override
	public void transferencia(double pValor) {
		System.out.println("\n\t____| REALIZANDO TRANSFERENCIA |____");
		System.out.println("\n\t____| ....     aguarde    .... |____\n");
		
		System.out.println("\n\t_____________| LISTA DE " +getTitulo()+ " |_____________\n");
		for (Empresa empresa : empresas.values()) {
			System.out.println("\t Nome: " +empresa.getNome()+ "\n"
							  +"\t CNPJ: " +empresa.getCnpj()+ "\n"
							  +"\t_______________________________________________________\n");
		}
		
		Empresa informacoes = new Empresa();

		if (pValor <= this.saldo) {

			System.out.print("\t-Informe CNPJ: ");
			informacoes.setNome(input.nextLine());
			informacoes.setNome(input.nextLine());
			if (empresas.get(informacoes.getNome()) != null) {
				this.saldo -= pValor;
				
				empresa.setSaldo(this.saldo);
				
				empresas.get(informacoes.getNome()).setSaldo(pValor);
				
				System.out.println("\n\t-Transferencia Realizada com Sucesso");
				System.out.println("\t\t\t   -Data: " +dataOperacoes+ "\n");
				
				System.out.println("\t-Origem");
				System.out.println("\t-Nome: " +empresa.getNome());
				System.out.println("\t-Valor: " +pValor);
				System.out.println("\t-CPF: " +empresa.getCpf());
				System.out.println("\t-CNPJ: " +empresa.getCnpj()+ "\n");
				
				System.out.println("\t-Destinatario");
				System.out.println("\t-Nome: " +empresas.get(informacoes.getNome()).getNome());
				System.out.println("\t-CPF: " +empresas.get(informacoes.getNome()).getCpf()+"\n");
			}

		} else {
			System.out.println("\t-Saldo Insuficente");
		}
		System.out.println("\t______| FIM TRANSFERENCIA |______");
	}

	@Override
	public void investimento() {
		System.out.println("\t-Sem Investimento para Empresas no Momento-");
		
	}

	@Override
	public void saldo() {
		System.out.println("\tSaldo: " +empresa.getSaldo());
	}

	@Override
	public double capturandoValor() {
		double pValor;
		System.out.print("\n\tInforme o valor: ");
		pValor = input.nextDouble();
		return pValor;
	}


}
