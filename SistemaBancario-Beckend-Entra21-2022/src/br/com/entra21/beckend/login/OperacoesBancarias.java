package br.com.entra21.beckend.login;

import br.com.entra21.beckend.annotation.Informacao;

@Informacao(value = "Metodos De Acoes Bancarias")
public interface OperacoesBancarias {
	
	public void dadosBancario();
	
	public void deposito(double pValor);
	
	public void sacar(double pValor);
	
	public void transferencia(double pValor);
	
	public void investimento();
	
	public void saldo();
	
	public double capturandoValor();

}
