package br.mar.singrawms.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.mar.singrawms.api.model.ProcessoArrecadacao;

@Repository
public interface ProcessoArrecadacaoRepository extends JpaRepository<ProcessoArrecadacao, Long> {

}
