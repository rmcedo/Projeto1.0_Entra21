package br.com.entra21.beckend.cadastro;

import java.time.LocalDate;
import java.util.HashMap;

import br.com.entra21.beckend.Armazenar;
import br.com.entra21.beckend.Menu;
import br.com.entra21.beckend.annotation.Informacao;
import br.com.entra21.beckend.modelos.Cliente;

@Informacao(value = "Cadastro de Contas Fisicas")
public class ContaFisicaCrud extends Menu implements ICrud<Cliente>{
	
	private HashMap<String, Cliente> lista = new Armazenar().clientes; //TODO 03 - Java Avancado - Collections
	
	@Informacao(value = "Cadastro de Contas Fisicas")
	public ContaFisicaCrud() {
		super("CLIENTES", opcoes); // TODO 02 - POO - Heranca
	}
	
	@Override
	public byte capturarOpcao() {
		
		byte opcao = super.capturarOpcao();
		
		switch (opcao) {
		
		case 2:
			listar(lista);
			break;

		case 3:
			adicionar();
			break;
			
		case 4:
			exibirDetalhes(buscar(capturarChave()));
			break;

		case 5:
			editar(capturarChave());
			break;

		case 6:
			deletar(capturarChave());
			break;
		}
			
		return opcao;
	}

	@Override
	public void listar(HashMap<String, Cliente> lista)  {
		System.out.println("\n\t_____________| LISTA DE " +getTitulo()+ " |____________\n");
		for (Cliente cliente : lista.values()) {
			System.out.println("\t- Nome: " +cliente.getNome()+ "\n"
							  +"\t- CPF: " +cliente.getCpf()+ "\n"
							  +"\t______________________________________________\n");
		}
		System.out.println("\t______________ Armazenado | "+lista.size()+" |_______________\n");
	}

	@Override
	public void adicionar() {
		Cliente novo = capturarValores();
				
		if(buscar(novo)==null) {
			lista.put(novo.getNome(), novo);
		} else {
			System.out.println("\tCliente cadastrado com " +novo.getCpf()+ " existente");
		}
	}

	@Override
	public Cliente buscar(Cliente chave) {
		return lista.get(chave.getCpf());
	}

	@Override
	public void editar(Cliente chave) {
		Cliente dadosBancario = buscar(chave);
		
		if(dadosBancario==null) {
			System.out.println("\tCliente " +chave.getCpf()+ " inexistente.");
		} else {
			lista.put(chave.getCpf(), capturarValores());
			System.out.println("\t-Dados Atualizados-");
		}
	}

	@Override
	public void deletar(Cliente chave) {
		Cliente dadosBancario = buscar(chave);
		if(dadosBancario==null) {
			System.out.println("\tCliente " +chave.getCpf()+ " inexistente.");
		} else {
			lista.remove(chave.getCpf());
			System.out.println("\t-Cliente Excluido-");
		}

	}

	@Override
	public Cliente capturarChave() {
		Cliente informacoes = new Cliente();
		System.out.print("\n\tInforme CPF: ");
		informacoes.setCpf(super.getInput().nextLine());
		return informacoes;
	}

	@Override
	public Cliente capturarValores() {
		Cliente informacoes = new Cliente();
		
		System.out.println("\n\t_____________| CADASTRAMENTO |_____________\n");
		
		System.out.print("\tInforme seu nome: "); 
		informacoes.setNome(super.getInput().nextLine());
		informacoes.setNome(super.getInput().nextLine());
		
		System.out.print("\tInforme CPF: ");
		informacoes.setCpf(super.getInput().nextLine());
		
		System.out.print("\tInforme RG: ");
		informacoes.setRg(super.getInput().nextLine());
		
		System.out.print("\tInforme data de nascimento: ");
		informacoes.setDataNascimento(super.getInput().nextLine());
		
		System.out.print("\tInforme o sexo: ");
		informacoes.setSexo(super.getInput().nextLine());
		
		System.out.print("\tInforme nome da mae: ");
		informacoes.setNomeMae(super.getInput().nextLine());

		System.out.print("\tInforme nome do pai: ");
		informacoes.setNomePai(super.getInput().nextLine());
		
		System.out.print("\tInforme email: ");
		informacoes.setEmail(super.getInput().nextLine());
		
		System.out.print("\tInforme CEP: ");
		informacoes.setCep(super.getInput().nextLine());

		System.out.print("\tInforme o endereco: ");
		informacoes.setEndereco(super.getInput().nextLine());
		
		System.out.print("\tInforme o numero: ");
		informacoes.setNumero(super.getInput().nextLine());
		
		System.out.print("\tInforme o bairro: ");
		informacoes.setBairro(super.getInput().nextLine());
		
		System.out.print("\tInforme a cidade: ");
		informacoes.setCidade(super.getInput().nextLine());
		
		System.out.print("\tInforme o estado: ");
		informacoes.setEstado(super.getInput().nextLine());
		
		System.out.print("\tInforme o telefone: ");
		informacoes.setTelefone(super.getInput().nextLine());
		
		LocalDate data = LocalDate.now();
		
		informacoes.setContaCorrente("1202644-1");
		informacoes.setAgencia("7160");

		informacoes.setDataAtualizacao(data);
		informacoes.setDataCadastro(data);

		System.out.println("\n\t_____________ | CADASTRAMENTO FINALIZADO |_____________\n");
	
		return informacoes;
	}

	@Override
	public void exibirDetalhes(Cliente completo) {
		if(completo==null) {
			System.out.println("\tCliente Inexistente");
		} else {
			System.out.println(completo.toString());
		}
		
	}

}

