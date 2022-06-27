package br.com.entra21.beckend.modelos;

import java.time.LocalDate;
import java.util.ArrayList;

public class Cliente extends Pessoa {

	private LocalDate dataCadastro;
	private LocalDate dataAtualizacao;
	private ArrayList<String> reclamacoes;
	private String senha;

	public Cliente() {
		super();
	}

	public Cliente(String nome, String cpf, String rg, String dataNascimento, String sexo, String nomeMae,
			String nomePai, String email, String cep, String endereco, String numero, String bairro, String cidade,
			String estado, String telefone, LocalDate dataCadastro, LocalDate dataAtualizacao,
			ArrayList<String> reclamacoes, String senha, double saldo, String contaCorrente, String agencia) {
		super(nome, cpf, rg, dataNascimento, sexo, nomeMae, nomePai, email, cep, endereco, numero, bairro, cidade,
				estado, telefone, saldo, contaCorrente, agencia);
		this.dataCadastro = dataCadastro;
		this.dataAtualizacao = dataAtualizacao;
		this.reclamacoes = reclamacoes;
		this.senha = senha;
	}

	public Cliente(LocalDate dataCadastro, LocalDate dataAtualizacao, ArrayList<String> reclamacoes, String senha) {
		super();
		this.dataCadastro = dataCadastro;
		this.dataAtualizacao = dataAtualizacao;
		this.reclamacoes = reclamacoes;
		this.senha = senha;
	}

	public LocalDate getDataCadastro() {
		return dataCadastro;
	}

	public void setDataCadastro(LocalDate dataCadastro) {
		this.dataCadastro = dataCadastro;
	}

	public LocalDate getDataAtualizacao() {
		return dataAtualizacao;
	}

	public void setDataAtualizacao(LocalDate dataAtualizacao) {
		this.dataAtualizacao = dataAtualizacao;
	}

	public ArrayList<String> getReclamacoes() {
		return reclamacoes;
	}

	public void setReclamacoes(ArrayList<String> reclamacoes) {
		this.reclamacoes = reclamacoes;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	@Override
	public String toString() {
		return "\n\t============= Informacoes do Cliente =============\n" +
			   "\t Nome: "+ super.getNome() +"\n"+
			   "\t CPF: "+ super.getCpf() +"\n"+
			   "\t RG: "+ super.getRg() +"\n"+
			   "\t Data Nascimento: "+ super.getDataNascimento() +"\n"+	
			   "\t Sexo: "+ super.getSexo() +"\n"+
			   "\t Nome Mae: "+ super.getNomeMae() +"\n"+
			   "\t Nome Pai: "+ super.getNomePai() +"\n"+
			   "\t Email: "+ getEmail() +"\n"+
			   "\t Cep: "+ getCep() +"\n"+
			   "\t Endereco: "+ getEndereco() +"\n"+
			   "\t Numero: "+ getNumero() +"\n"+
			   "\t Bairro: "+ getBairro() +"\n"+
			   "\t Cidade: "+ getCidade() +"\n"+
			   "\t Estado: "+ getEstado() +"\n"+
			   "\t Telefone: "+ getTelefone() +"\n"+
			   "\t Conta Corrente: "+ getContaCorrente()+"\n"+
			   "\t Ag�ncia: "+ getAgencia()+"\n"+
			   "\t Data de Cadastro: "+ getDataCadastro()+"\n"+
			   "\t Comentario: "+ getReclamacoes()+"\n"+
			   "\t==================================================\n";
	}
}
