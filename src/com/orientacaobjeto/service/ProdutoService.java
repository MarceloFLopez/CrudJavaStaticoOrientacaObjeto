package com.orientacaobjeto.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.orientacaobjeto.model.Produto;
import com.orientacaobjeto.service.impl.ProdutoServiceImpl;

public class ProdutoService implements ProdutoServiceImpl {
	Scanner sc = new Scanner(System.in);
	private List<Produto> produtos = new ArrayList<Produto>();

	@Override
	public void salvarProduto(Produto produto) {
		produtos.add(produto);
		System.out.println("Produto salvo com sucesso!");
	}

	@Override
	public List<Produto> listarProdutos() {
		return produtos;
	}

	@Override
	public Produto buscarProduto(Integer id) {
		Produto carregarProduto = new Produto();
		for (Produto produto : produtos) {
			if (produto.getId().equals(id)) {
				carregarProduto = produto;
				return carregarProduto;
			}
		}
		return null;

	}

	@Override
	public void editarProduto(Integer id) {

		boolean edit = false;

		for (int i = 0; i < produtos.size(); i++) {
			if (produtos.get(i).getId().equals(id)) {
				System.out.print("Informe a descricao do produto: ");
				produtos.get(i).setDescricao(sc.nextLine());
				System.out.print("Informe a marca do produto: ");
				produtos.get(i).setcategoria(sc.nextLine());
				System.out.print("Informe o valor do produto: ");
				produtos.get(i).setValorUni(sc.nextDouble());
				System.out.print("Informe a quantidade do produto: ");
				produtos.get(i).setQuanridade(sc.nextInt());
				System.out.println("Produto editador com sucesso!");
				edit = true;
			}
		}
		if (edit != true) {
			System.out.println("ID não encontrado!");
		}
	}

	@Override
	public void deletarProduto(Integer id) {
		boolean remove = false;
		for (int i = 0; i < produtos.size(); i++) {
			if (produtos.get(i).getId().equals(id)) {
//				produtos.remove(i);
				produtos.get(i).setDataValidade(null);
				produtos.get(i).setDescricao(null);
				produtos.get(i).setcategoria(null);
				produtos.get(i).setQuanridade(null);
				produtos.get(i).setValorUni(null);
				remove = true;
			}
		}
		if (remove == true) {
			System.out.println("Produto removido com sucesso!");
		} else {
			System.out.println("Produto Inexistente!");
		}
	}

}
