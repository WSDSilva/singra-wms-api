package br.mar.singrawms.api.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name="ITEM")
public class ItemProcesso {
	
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="SQ_ITEM")
	@SequenceGenerator(name="SQ_ITEM", sequenceName="SEQ_ITEM", allocationSize=1)
	@Column(name="ID_ITEM")
	private Long id;
	
	@ManyToOne
	@NotNull
	@JoinColumn(name="PROCESSO_ID")
	@JsonIgnore
	private ProcessoArrecadacao processoArrecadacao;
	
	@ManyToOne
	@NotNull
	@JoinColumn(name="PRODUTO_ID")
	private Produto produto;
	
	@NotNull
	private int quantidade;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public ProcessoArrecadacao getProcessoArrecadacao() {
		return processoArrecadacao;
	}

	public void setProcessoArrecadacao(ProcessoArrecadacao processoArrecadacao) {
		this.processoArrecadacao = processoArrecadacao;
	}

	public Produto getProduto() {
		return produto;
	}

	public void setProduto(Produto produto) {
		this.produto = produto;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
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
		ItemProcesso other = (ItemProcesso) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
	
	
	
	
	

}
