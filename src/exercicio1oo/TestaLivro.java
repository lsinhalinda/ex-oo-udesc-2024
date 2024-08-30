package exercicio1oo;
public class TestaLivro {
    public static void main(String[] args) {
        Livro book = new Livro();
        book.nome="A menina que roubava livros";
        book.emprestar();

        if(book.indisponivel()){
            System.out.println("Disponível para retirada!");
        }else{
            System.out.println("Indisponível para retirada");
        }
        book.devolver();
        if(book.indisponivel()){
            System.out.println("Disponível para retirada!");
        }else{
            System.out.println("Indisponível para retirada");
        }
    }
}
