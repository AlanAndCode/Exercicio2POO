public class ContaCorrente{
/* Você deverá implementar um sistema bancário simples em Java para gerenciar contas correntes. O objetivo é criar um programa que permita criar contas correntes, realizar depósitos e saques, verificar o limite da conta, e determinar se o cheque especial está sendo utilizado */
private int numero;
private Double saldo;
private boolean status;
private double limite;
  private boolean usandoChequeEspecial;
  public ContaCorrente(int numero, double saldo, boolean status, double limite){
   this.numero= numero;
    this.saldo= saldo;
    this.status = status;
    this.limite = limite;
    this.usandoChequeEspecial = false; 
  }

  public int getNumero(){
    return numero;
  }

  public void setNumero(int numero){
    this.numero = numero;
  }

  public Double getSaldo(){
    return saldo;
  }

  public void setSaldo(Double saldo){
    this.saldo = saldo;
  }


  public void getStatus(){
    status = true;
  }

  public boolean isStatus() {
    return status;
  }

  public void setStatus(boolean status) {
    this.status = status;
  }
  
  public double getLimite() {
    return limite;
  }
  
  public void setLimite(double limite){
    limite = this.limite;
  }


  public boolean estaUsandoChequeEspecial() {
    return usandoChequeEspecial;
  }

  // Método para definir o status de uso do cheque especial
  public void setUsandoChequeEspecial(boolean usandoChequeEspecial) {
    this.usandoChequeEspecial = true;
  }
  
  public void depositar(double valor) {
     System.out.println(" saldo antes do deposito: " + saldo);
        this.saldo += valor;
        System.out.println("Depósito de R$" + valor + " realizado com sucesso. Saldo atual: R$" + this.saldo);
  }

  // Método para sacar
  public void sacar(double valor) {
    if (status) {
        if (valor <= this.saldo + limite) {
          System.out.println(" saldo antes do saque: " + saldo);
            this.saldo -= valor;
            System.out.println("Saque de R$" + valor + " realizado com sucesso. Saldo atual: R$" + this.saldo);
         
        } else if(valor > saldo + limite) {
            System.out.println("SAQUE NAO PERMITIDO, VOCE ESTOURARIA O LIMITE, TENTE UM VALOR MENOR");
        }
    } else if(valor < saldo) {
      System.out.println(" saldo antes do saque: " + saldo);
      this.saldo -= valor;
      System.out.println("Saque de R$" + valor + " realizado com sucesso. Saldo atual: R$" + this.saldo);
    } else{
      System.out.println("Saldo insuficiente. Saque não realizado.");
    }
    
    VerEspecial();
  }

  // Método para ver o limite
  public void verLimite() {
    System.out.println("O limite da conta é: R$" + this.limite);
  }
   public void VerEspecial(){
     if(saldo < 0){
       System.out.println("Voce esta usando o cheque especial");
     }else{
       System.out.println("Voce nao esta usando o cheque especial");
     }
   }
  // Método para ver o status da conta
  public void verStatus() {
    String statusString = this.status ? "especial" : "nao especial";
    System.out.println("Conta " + statusString);
    
  }
  
}