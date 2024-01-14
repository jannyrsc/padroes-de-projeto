package ProvaFacade;

public class BibliotecaFacade {
    private GerenciadorLivros gerenciadorLivros;
    private GerenciadorUsuarios gerenciadorUsuarios;
    private GerenciadorEmprestimos gerenciadorEmprestimos;

    public BibliotecaFacade() {
        this.gerenciadorLivros = new GerenciadorLivros();
        this.gerenciadorUsuarios = new GerenciadorUsuarios();
        this.gerenciadorEmprestimos = new GerenciadorEmprestimos();
    }

    public void adicionarLivro(String titulo, String autor) {
        Livro livro = new Livro(titulo, autor);
        gerenciadorLivros.adicionarLivro(livro);
    }

    public void cadastrarUsuario(String nome, int codigo) {
        Usuario usuario = new Usuario(nome, codigo);
        gerenciadorUsuarios.cadastrarUsuario(usuario);
    }

    public void realizarEmprestimo( String dataEmprestimo) {
        gerenciadorEmprestimos.realizarEmprestimo(dataEmprestimo);
    }

    public void run() {
        adicionarLivro("Eu, Robô", "Isaac Asimov");
        cadastrarUsuario("Camile", 1);
        realizarEmprestimo( "19/12/2023");
    }
}


