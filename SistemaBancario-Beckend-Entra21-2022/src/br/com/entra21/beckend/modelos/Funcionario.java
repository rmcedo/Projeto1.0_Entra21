package br.com.entra21.beckend.modelos;

import java.time.LocalDateTime;
import java.util.ArrayList;

public class Funcionario extends Pessoa {

	private LocalDateTime dataAdimissao;
	private LocalDateTime dataDemissao;
	private ArrayList<String> feedback;

	public Funcionario() {
		super();

	}

}