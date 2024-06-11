package main;

import domain.IPhone;

public class Main {

	public static void main(String[] args) {

		IPhone iPhone = new IPhone();
		
		System.out.println("<------- Funções de Telefone -------->");
		iPhone.ligar("(99) 9 9999-9999");
		iPhone.atender();
		iPhone.iniciarCorreioVoz();
		
		System.out.println("<------- Funções de Reprodutor Musical -------->");
		iPhone.selecionarMusica("O sentido - catedral");
		iPhone.tocar();
		iPhone.pausar();
		
		System.out.println("<------- Funções de Navegador de internet -------->");
		iPhone.adicionarNovaAba();
		iPhone.exibirPagina("www.google.com.br");
		iPhone.atualizarPagina();
	}

}
