package exercicio1oo;

public class Circulo {
    public double raiocirculo;

    public double calcularArea() {
        return 3.1415*(raiocirculo*raiocirculo);
    }
    public double calcularPerimetro(){
        return (2*3.1415)*raiocirculo;
    }
    public double calcularDiametro(){
        return raiocirculo*2;
    }
}