package br.com.entra21.beckend.modelos;

import java.time.LocalDate;

public class Empresa extends Pessoa {

	private String razaoSocial;
	private String cnpj;
	private String inscricaoEstadual;
	private LocalDate dataDeAbertura;
	private String senha;

	public Empresa() {
		super();
	}

	public Empresa(String nome, String cpf, String rg, String dataNascimento, String sexo, String nomeMae,
			String nomePai, String email, String cep, String endereco, String numero, String bairro, String cidade,
			String estado, String telefone, String razaoSocial, String cnpj, String inscricaoEstadual,
			LocalDate dataDeAbertura, String senha, double saldo, String contaCorrente, String agencia) {
		super(nome, cpf, rg, dataNascimento, sexo, nomeMae, nomePai, email, cep, endereco, numero, bairro, cidade,
				estado, telefone, saldo, contaCorrente, agencia);
		this.razaoSocial = razaoSocial;
		this.cnpj = cnpj;
		this.inscricaoEstadual = inscricaoEstadual;
		this.dataDeAbertura = dataDeAbertura;
		this.senha = senha;
	}

	public Empresa(String razaoSocial, String cnpj, String inscricaoEstadual, LocalDate dataDeAbertura, String senha) {
		super();
		this.razaoSocial = razaoSocial;
		this.cnpj = cnpj;
		this.inscricaoEstadual = inscricaoEstadual;
		this.dataDeAbertura = dataDeAbertura;
		this.senha = senha;
	}

	public String getRazaoSocial() {
		return razaoSocial;
	}

	public void setRazaoSocial(String razaoSocial) {
		this.razaoSocial = razaoSocial;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public String getInscricaoEstadual() {
		return inscricaoEstadual;
	}

	public void setInscricaoEstadual(String inscricaoEstadual) {
		this.inscricaoEstadual = inscricaoEstadual;
	}

	public LocalDate getDataDeAbertura() {
		return dataDeAbertura;
	}

	public void setDataDeAbertura(LocalDate dataDeAbertura) {
		this.dataDeAbertura = dataDeAbertura;
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
			   "\t Cep: "+ getCep() +"\n"+
			   "\t Endereco: "+ getEndereco() +"\n"+
			   "\t Numero: "+ getNumero() +"\n"+
			   "\t Bairro: "+ getBairro() +"\n"+
			   "\t Cidade: "+ getCidade() +"\n"+
			   "\t Estado: "+ getEstado() +"\n"+
			   "\t Telefone: "+ getTelefone() +"\n"+
			   "\t Razao Social: "+ getRazaoSocial() +"\n"+
			   "\t CNPJ: "+ getCnpj() +"\n"+
			   "\t Inscricao Estadual: "+ getInscricaoEstadual() +"\n"+
			   "\t Data de Abertura: "+ getDataDeAbertura()+"\n"+
			   "\t Conta Corrente: "+ getContaCorrente()+"\n"+
			   "\t Agencia: "+ getAgencia()+"\n"+
			   "\t==================================================\n";		
	}

}

