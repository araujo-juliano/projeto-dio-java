package digitalinnovation.strategy;


public class App {
    public static void main(String[] args) {

    Comportamento defensivo = new ComportamentoDefensivo();
		Comportamento normal = new ComportamentoMovimento();
		Comportamento agressivo = new ComportamentoAtaque();
		Comportamento ataqueEspecial = new ComportamentoAtaqueEspecial();
		Comportamento esquiva = new ComportamentoEsquiva();

		Lutador lutador = new Lutador();

		System.out.println("Início da Luta");
		System.out.println("Lutador 1: ");
		lutador.setComportamento(normal);
		lutador.mover();

		System.out.println("Lutador 2: ");
		lutador.setComportamento(normal);
		lutador.mover();
		System.out.println(" ");

		System.out.println("Lutador 1: ");
		lutador.setComportamento(agressivo);
		lutador.mover();
		System.out.println("Lutador 2: ");
		lutador.setComportamento(defensivo);
		lutador.mover();
		System.out.println(" ");

		System.out.println("Lutador 1: ");
		lutador.setComportamento(normal);
		lutador.mover();
		System.out.println("Lutador 2: ");
		lutador.setComportamento(normal);
		lutador.mover();
		System.out.println(" ");

		System.out.println("Lutador 1: ");
		lutador.setComportamento(agressivo);
		lutador.mover();
		System.out.println("Lutador 2: ");
		lutador.setComportamento(esquiva);
		lutador.mover();
		System.out.println(" ");

		System.out.println("Lutador 2: ");
		lutador.setComportamento(agressivo);
		lutador.mover();
		System.out.println("Lutador 1: ");
		lutador.setComportamento(esquiva);
		lutador.mover();
		System.out.println(" ");

		System.out.println("Lutador 2: ");
		lutador.setComportamento(ataqueEspecial);
		lutador.mover();
		System.out.println(" ");
		System.out.println("Lutador 2 Vence!!");
		System.out.println(" "); 
    }
}
