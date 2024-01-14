package ProvaFacade;

//subsistema
public class GerenciadorUsuarios {
    public void cadastrarUsuario(Usuario usuario) {
        System.out.println("Usuário cadastrado: " + usuario.getNome() + " - Código: " + usuario.getCodigo());
        // Lógica para realizar cadastrar usuario
    }
}
