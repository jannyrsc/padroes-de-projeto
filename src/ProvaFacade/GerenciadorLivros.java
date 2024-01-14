package ProvaFacade;

//subsistema
public class GerenciadorLivros {
    public void adicionarLivro(Livro livro) {
        System.out.println("Livro adicionado: " + livro.getTitulo() + " - Autor: " + livro.getAutor());
        // Lógica para realizar adicionar livro
    }
}
