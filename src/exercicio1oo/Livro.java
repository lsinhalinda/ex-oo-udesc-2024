package exercicio1oo;
public class Livro {
    public String nome, autor;
    public boolean disponivel = true;

    public boolean indisponivel() {
        return disponivel;
    }
    public void emprestar(){
        disponivel=false;
        System.out.println("Livro indisponivel para retirada");
    }
    public void devolver(){
        disponivel=true;
        System.out.println("Livro disponivel para retirada/emprestimo");
    }

}
