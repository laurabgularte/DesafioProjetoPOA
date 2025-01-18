public abstract class ContaBancaria {
  protected double saldo;

  public ContaBancaria(double saldo) {
      this.saldo = saldo;
  }

  public void depositar(double valor) {
      saldo += valor;
  }

  public void consultarSaldo() {
      System.out.println("Saldo: " + saldo);
  }

  public abstract void sacar(double valor);
}
