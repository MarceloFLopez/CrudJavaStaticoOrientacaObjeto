package com.orientacaobjeto.interfaces;

public interface Menu {

	static void intro() {
		System.out.println("\n***********MENU***********\n\n");
	}
		
	static void opcao() {
		System.out.println("\n1-Novo\n"
				+ "2-Listar\n"
				+ "3-Buscar\n"
				+ "4-Editar\n"
				+ "5-Deletar\n"
				+ "0-Sair");
	}
	
	static void msgNovoRegistrio() {
		System.out.println("\n***********NOVO PRODUTO***********\n\n");
	}
	
	static void msgNovoRegistrioRepetir() {
		System.out.println("\n***********GOSTARIA DE CONTINUAR CADASTRANDO***********\n\n");
	}
	
	static void opcaSimOuNao() {
		System.out.println("\n***********S - Sim / N - NAO***********\n\n");
	}
	static void msgEditarRegistrio() {
		System.out.println("\n***********EDITAR PRODUTO***********\n\n");
	}
	static void listarProdutos() {
		System.out.println("\n***********LISTAGEM DE PRODUTOS**********\n\n");
	}
	static void opcaSimOuNaoDeletar() {
		System.out.println("\n***********CONFIRMAR A EXCLUSAO***********"
				+ "\n***********S - Sim / N - NAO***********\n\n");
	}
	static void msgBuscarId() {
		System.out.println("\n***********INSIRA O ID DO PRODUTO***********\n\n");
	}
	
	static void opcaoInvalida() {
		System.out.println("\n***********OPCAO INVALIDA***********\n\n");
	}
	
	static void saindSistema() {
		System.out.println("\n***********SAINDO DO SISTEMA***********\n\n");
	}
}
