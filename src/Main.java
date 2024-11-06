//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Livro livro = new Livro("Java para iniciantes", "José da Silva");
        RepositorioLivro repositorio = new RepositorioLivro();
        repositorio.salvar(livro);
    }
}