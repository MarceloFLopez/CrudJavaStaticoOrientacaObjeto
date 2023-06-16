package com.orientacaobjeto.model;

import java.time.LocalDate;

public class Produto {

	private Integer id;
	private String descricao;
	private String categoria;
	private Double valorUni;
	private Integer quanridade;
	private LocalDate dataValidade;

	public Produto() {
	}

	public Produto(Integer id, String descricao, String categoria, Double valorUni, Integer quanridade,
			LocalDate dataValidade) {
		super();
		this.id = id;
		this.descricao = descricao;
		this.categoria = categoria;
		this.valorUni = valorUni;
		this.quanridade = quanridade;
		this.dataValidade = dataValidade;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getcategoria() {
		return categoria;
	}

	public void setcategoria(String categoria) {
		this.categoria = categoria;
	}

	public Double getValorUni() {
		return valorUni;
	}

	public void setValorUni(Double valorUni) {
		this.valorUni = valorUni;
	}

	public LocalDate getDataValidade() {
		return dataValidade;
	}

	public void setDataValidade(LocalDate dataValidade) {
		this.dataValidade = dataValidade;
	}

	@Override
	public String toString() {
		return "\nProduto [id=" + id + ", descricao=" + descricao + ", categoria=" + categoria + ", valorUni=" + valorUni
				+ ", quanridade=" + quanridade + ", dataValidade=" + dataValidade + "]";
	}

	public Integer getQuanridade() {
		return quanridade;
	}

	public void setQuanridade(Integer quanridade) {
		this.quanridade = quanridade;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Produto other = (Produto) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

}
