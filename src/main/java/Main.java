public class Main {
  public static void main(String[] args) {
   ContaCorrente conta = new ContaCorrente(1,100.0, false, 200.0);

    

    // Exibir status inicial da conta
    conta.verStatus();

    // Ver o limite da conta
    conta.verLimite();

    // Realizar um depósito
    conta.depositar(50.0);

    // Realizar um saque
    conta.sacar(120.0);

    // Tentar realizar um saque que ultrapassa o saldo + limite
    conta.sacar(200.0);
    




    
  }

  // @Test
  // void addition() {
  //     assertEquals(2, 1 + 1);
  // }
}