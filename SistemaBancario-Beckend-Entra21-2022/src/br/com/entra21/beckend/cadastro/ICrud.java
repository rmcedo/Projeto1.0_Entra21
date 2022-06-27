package br.com.entra21.beckend.cadastro;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

import br.com.entra21.beckend.annotation.Informacao;

@Informacao(value = "ICRUD = CREAT | READ | UPDATE | DELETE ")
public interface ICrud<T> { //TODO 03 - Java Avancado - Generics
	
	ArrayList<String> opcoes = new ArrayList<String>( //TODO 03 - Java Avancado - Collections
			Arrays.asList("| LISTAR |", "| ADICIONAR |", "| BUSCAR |", "| EDITAR |", "| DELETAR |"));
	
	public void listar(HashMap<String,T> lista);

	public void adicionar();

	public T buscar(T chave);

	public void editar(T chave);

	public void deletar(T chave);

	public T capturarChave();

	public T capturarValores();
	
	public void exibirDetalhes(T completo);

}
