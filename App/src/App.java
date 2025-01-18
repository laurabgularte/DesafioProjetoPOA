public class App {
    public static void main(String[] args) {
        ContaBancaria contaInvestimento = new ContaInvestimento(1000);
        ContaBancaria contaPoupanca = new ContaPoupanca(1000, 1);
  
        contaInvestimento.depositar(500);
        contaInvestimento.consultarSaldo();
        contaInvestimento.sacar(200);
        contaInvestimento.consultarSaldo();
  
        contaPoupanca.depositar(500);
        contaPoupanca.consultarSaldo();
        contaPoupanca.sacar(200);
        contaPoupanca.consultarSaldo();
    }
  }