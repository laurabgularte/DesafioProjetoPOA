public class ContaPoupanca extends ContaBancaria {
  private int diaRendimento;

  public ContaPoupanca(double saldo, int diaRendimento) {
      super(saldo);
      this.diaRendimento = diaRendimento;
  }

  @Override
  public void sacar(double valor) {
      
  }

  public int getDiaRendimento() {
      return diaRendimento;
  }

  public void setDiaRendimento(int diaRendimento) {
      this.diaRendimento = diaRendimento;
  }
}