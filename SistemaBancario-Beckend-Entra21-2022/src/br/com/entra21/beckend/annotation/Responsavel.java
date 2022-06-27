package br.com.entra21.beckend.annotation;

/**
* Um TODO voltado para grupos
* de desenvolvedores, onde pode-se
* especificar a pessoa a quem se destina o item
*/
public @interface Responsavel { // TODO 02 - POO - Interface
		
		public enum OrdemDePrioridade {
			CRITICO, IMPORTANTE, TRIVIAL, DOCUMENTAR
		};
		
		OrdemDePrioridade ordemDePrioridade() default OrdemDePrioridade.IMPORTANTE;
		
		String toDo();
		
		String responsavel();

	}

