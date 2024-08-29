package exercicio1oo;

public class TestaContaBancaria {
    public static void main(String[] args) {
        ContaBancaria Conta = new ContaBancaria();
        Conta.cliente="Isadora";
        Conta.saldo=1500.0;
        Conta.depositar(500);
        System.out.println("Saldo: "+Conta.consultarSaldo());
    }
}
