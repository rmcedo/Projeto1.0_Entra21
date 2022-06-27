package br.com.entra21.beckend;

import java.time.Duration;
import java.time.Instant;

import br.com.entra21.beckend.annotation.Informacao;

@Informacao(value = "Tempo no Programa")
public class TempoNoPrograma {
		
	public static void fim(Instant start) {
		
		Instant stop = Instant.now();
		
		Duration duracao = Duration.between(start, stop);

		System.out.println("\t______________________________________________\n");
		System.out.println("\tMilisegundos Passado no Programa = " + duracao.toMillis());
		System.out.println("\tSegundos Passado no Programa = " + duracao.toSeconds());
		System.out.println("\tMinutos Passado no Programa = " + duracao.toMinutes());
		System.out.println("\tHoras Passado no Programa = " + duracao.toHours());
		System.out.println("\t______________________________________________");

	}
	
}
