package exercicio1oo;

public class TestaAluno {
    public static void main(String[] args) {
        Aluno a1 = new Aluno();
        a1.nome="Isadora";
        a1.idade=18;
        a1.n1=10;
        a1.n2=9;
        a1.n3=8;
        a1.n4=7;
        a1.verificarSituacao();
        System.out.println("Média: "+a1.calcularMedia());
    }
}
