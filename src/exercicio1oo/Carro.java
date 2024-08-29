package exercicio1oo;
public class Carro {
    public String modelo;
    public double velocidade=0;
    public void acelerar(){
        velocidade+=20;
        System.out.println("Acelerador acionado");}
    public void frear(){
        velocidade-=20;
        System.out.println("Freio acionado");}
    public double consultarVelocidade() {
        return velocidade;}

}
