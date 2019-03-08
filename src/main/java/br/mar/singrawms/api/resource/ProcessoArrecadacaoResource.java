package br.mar.singrawms.api.resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.mar.singrawms.api.model.ProcessoArrecadacao;
import br.mar.singrawms.api.repository.ProcessoArrecadacaoRepository;


@RestController
@RequestMapping("/processo")
public class ProcessoArrecadacaoResource {
	
	@Autowired
	ProcessoArrecadacaoRepository processoRepository;
	
	@GetMapping
	public List<ProcessoArrecadacao> listar(){
		return processoRepository.findAll(); 
	}

}
