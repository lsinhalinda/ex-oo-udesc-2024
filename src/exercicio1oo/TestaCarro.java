package exercicio1oo;
public class TestaCarro {
    public static void main(String[] args) {
        Carro car = new Carro();
        car.acelerar();
        car.acelerar();
        car.frear();
        System.out.println("Velocidade: "+car.consultarVelocidade());

    }
}
