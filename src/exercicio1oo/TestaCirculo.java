package exercicio1oo;

public class TestaCirculo {
    public static void main(String[] args) {
        Circulo circ = new Circulo();
        circ.raiocirculo=10;
        System.out.println("Perímetro: "+circ.calcularPerimetro());
        System.out.println("Area: "+circ.calcularArea());
        System.out.println("Diametro: "+circ.calcularDiametro());
    }
}