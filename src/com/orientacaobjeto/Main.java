package com.orientacaobjeto;

import java.time.LocalDate;
import java.util.List;
import java.util.Scanner;

import com.orientacaobjeto.interfaces.Menu;
import com.orientacaobjeto.model.Produto;
import com.orientacaobjeto.service.ProdutoService;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		ProdutoService s = new ProdutoService();
		Menu.intro();

		int op = 0;

		do {
			Menu.opcao();
			System.out.print("OPCAO_");

			op = sc.nextInt();

			switch (op) {
			case 1:
				String escolha = "N";
				do {
					Menu.msgNovoRegistrio();
					Produto p = new Produto();
					System.out.print("Informe a descricao do produto: ");
					sc.nextLine();
					p.setDescricao(sc.nextLine());

					System.out.print("Informe a marca do produto: ");
					p.setMarca(sc.nextLine());
					System.out.print("Informe o valor do produto: ");
					p.setValorUni(sc.nextDouble());
					System.out.print("Informe a quantidade do produto: ");
					p.setQuanridade(sc.nextInt());
					p.setId(s.listarProdutos().size() + 1);

					p.setDataValidade(LocalDate.now());
					s.salvarProduto(p);
					System.out.println("Gostaria de criar um novo registro?");
					Menu.opcaSimOuNao();
					escolha = sc.next();
				} while (escolha.equalsIgnoreCase("S"));

				break;
			case 2:
				if (s.listarProdutos().isEmpty()) {
					System.err.println("\nLista Vazia!");
				} else {
					List<Produto> novaLista = s.listarProdutos();
					for (int i = 0; i < novaLista.size(); i++) {
						if (novaLista.get(i).getDescricao() != null) {
							System.out.println(novaLista.get(i));
						}
					}
				}
				break;
			case 3:
				if (s.listarProdutos().isEmpty()) {
					System.err.println("\nLista Vazia!");
				} else {
					Menu.msgBuscarId();
					Produto p1 = new Produto();
					System.out.print("Informe o ID do produto_");
					p1 = s.buscarProduto(sc.nextInt());
					if (p1 != null) {
						System.out.println(p1);
					} else {
						System.err.println("\nID Inválido!\n");
					}
				}

				break;
			case 4:
				if (s.listarProdutos().isEmpty()) {
					System.err.println("\nLista Vazia!");
				} else {
					Menu.msgBuscarId();
					System.out.print("Informe o ID do produto_");
					s.editarProduto(sc.nextInt());
				}

				break;
			case 5:
				String escolha1 = "N";
				if (s.listarProdutos().isEmpty()) {
					System.err.println("\nLista Vazia!");
				} else {
					Menu.msgBuscarId();
					Produto p1 = new Produto();
					System.out.print("Informe o ID do produto_");
					p1 = s.buscarProduto(sc.nextInt());
					if (p1 != null) {
						Menu.opcaSimOuNaoDeletar();
						escolha1 = sc.next();
						if (escolha1.equalsIgnoreCase("S")) {
							s.deletarProduto(p1.getId());
						}
					} else {
						System.err.println("\nID Inválido!\n");
					}
				}
				break;
			default:
				break;
			}
		} while (op != 0);
		sc.close();
	}
}
