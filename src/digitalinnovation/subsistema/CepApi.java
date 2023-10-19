package digitalinnovation.subsistema;

public class CepApi {
  private static CepApi instancia = new CepApi();

	private CepApi() {
		super();
	}

	public static CepApi getInstancia() {
		return instancia;
	}

	public String recuperarBairro(String cep) {
		return "Meu Cantinho";
	}
	
	public String recuperarCidade(String cep) {
		return "Suzano";
	}
	
	public String recuperarEstado(String cep) {
		return "SP";
	}
}
