package digitalinnovation.subsistema;

public class CrmService {
  private CrmService() {
		super();
	}
	
	public static void gravarCriador(String nome, String cep, String bairro, String cidade, String estado) {
		System.out.println(" ");
		System.out.println("Criador salvo no sistema de CRM:");
		System.out.println(nome);
		System.out.println(cep);
		System.out.println(bairro);
		System.out.println(cidade);
		System.out.println(estado);
		System.out.println("Obrigado pela visita, até a próxima");
	}
}
