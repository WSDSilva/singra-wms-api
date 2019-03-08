package br.mar.singrawms.api.model;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name="PROCESSO_ARRECADACAO")
public class ProcessoArrecadacao {
	
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="SQ_PROCESSO")
	@SequenceGenerator(name="SQ_PROCESSO", sequenceName="SEQ_PROCESSO_ARRECADACAO", allocationSize=1)
	@Column(name="ID_PROCESSO")
	private Long id;
	
	@NotNull
	@Column(name="OM_ID")
	private Long idOM;
	
	@NotNull
	@Column(name="TIPO_DOC")
	private String tipoDoc;
	
	@NotNull
	@Column(name="NUM_DOC")
	private String numDoc;
	
	@NotNull
	@Column(name="CODEMP")
	private String codEmp;
	
	@NotNull
	@Column(name="DATA_CRIACAO")
	@DateTimeFormat(pattern="dd/MM/YY")
	private LocalDate dataCriacao;

	@OneToMany(mappedBy="processoArrecadacao")
	private List<ItemProcesso> itemProcesso;

	public List<ItemProcesso> getItemProcesso() {
		return itemProcesso;
	}

	public void setItemProcesso(List<ItemProcesso> itemProcesso) {
		this.itemProcesso = itemProcesso;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getIdOM() {
		return idOM;
	}

	public void setIdOM(Long idOM) {
		this.idOM = idOM;
	}

	public String getTipoDoc() {
		return tipoDoc;
	}

	public void setTipoDoc(String tipoDoc) {
		this.tipoDoc = tipoDoc;
	}

	public String getNumDoc() {
		return numDoc;
	}

	public void setNumDoc(String numDoc) {
		this.numDoc = numDoc;
	}

	public String getCodEmp() {
		return codEmp;
	}

	public void setCodEmp(String codEmp) {
		this.codEmp = codEmp;
	}

	public LocalDate getDataCriacao() {
		return dataCriacao;
	}

	public void setDataCriacao(LocalDate dataCriacao) {
		this.dataCriacao = dataCriacao;
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
		ProcessoArrecadacao other = (ProcessoArrecadacao) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
		

}
