package com.marcelo.syspsi.domain;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.marcelo.syspsi.domain.enums.TipoDespesa;

@Entity
public class Despesa implements Serializable {		
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private Integer tipo;
	private Double valor;
	private Date data;
	
	public Despesa() {		
	}

	public Despesa(Integer id, TipoDespesa tipo, Double valor, Date data) {
		super();
		this.id = id;
		this.tipo = tipo.getCod();
		this.valor = valor;
		this.data = data;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public TipoDespesa getTipo() {
		return TipoDespesa.toEnum(tipo);
	}

	public void setTipo(TipoDespesa tipo) {
		this.tipo = tipo.getCod();
	}

	public Double getValor() {
		return valor;
	}

	public void setValor(Double valor) {
		this.valor = valor;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
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
		Despesa other = (Despesa) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}	
}
