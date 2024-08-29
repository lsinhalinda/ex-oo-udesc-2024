package exercicio1oo;

public class ContaBancaria {
    public String cliente;
    public double saldo;
    public void sacar(double valor){
        saldo-=valor;
        System.out.println("Seu saque foi de: "+ valor);
    }
    public void depositar(double valor){
        saldo+=valor;
        System.out.println("Seu deposito foi no valor de: "+valor);
    }
    public double consultarSaldo(){
        return saldo;
    }
}