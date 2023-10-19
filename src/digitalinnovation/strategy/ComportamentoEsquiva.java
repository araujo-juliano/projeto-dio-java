package digitalinnovation.strategy;

public class ComportamentoEsquiva implements Comportamento {
  @Override
  public void mover() {
    System.out.println("Esquivou-se...");
  }
}
