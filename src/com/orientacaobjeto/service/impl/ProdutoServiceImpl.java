package com.orientacaobjeto.service.impl;

import java.util.List;

import com.orientacaobjeto.model.Produto;

public interface ProdutoServiceImpl {

	void salvarProduto(Produto produto);
	List<Produto> listarProdutos();
	Produto buscarProduto(Integer id);  
	void editarProduto(Integer id); 
	void deletarProduto(Integer id);
}
