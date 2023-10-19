package digitalinnovation.facade;

import digitalinnovation.subsistema.CrmService;
import digitalinnovation.subsistema.CepApi;

public class Facade {
	
  public void migrarCriador(String nome, String cep) {
		String bairro = CepApi.getInstancia().recuperarBairro(cep);
		String cidade = CepApi.getInstancia().recuperarCidade(cep);
		String estado = CepApi.getInstancia().recuperarEstado(cep);
		
		CrmService.gravarCriador(nome, cep, bairro, cidade, estado);
	}
}

