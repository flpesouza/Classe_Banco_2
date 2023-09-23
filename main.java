public class CaixaEletronico { 
  public static void main(String[] args){ 
    Agencia agencia = new Agencia("Inter",7890,5); 
    ContaCorrente contacorrente = new ContaCorrente(1234, 4, 150, agencia); 
    Cliente cliente = new Cliente("Maria José","123231518-12",contacorrente); 
    System.out.println("Saque: R$"+contacorrente.sacar(140)); 
    System.out.println("Saldo atual: R$"+contacorrente.consultarSaldo()); 
    contacorrente.sacar(200); 
    System.out.println("Saldo: R$"+contacorrente.consultarSaldo()); 
    contacorrente.depositar(25.45); 
    System.out.println("Deposito efetuado no valor de R$25.45"); 
    contacorrente.imprimirSaldo(); 
    } 
  }
