import java.util.ArrayList;
import java.util.List;

public class Livraria {

    private final List<Livro> livros;

    public Livraria() {
        this.livros = new ArrayList<>();
    }

    public void adicionarLivro(Livro livro) {
        this.livros.add(livro);
    }

    public void removerLivro(Livro livro) {
        this.livros.remove(livro);
    }

    public void listarLivros() {
        for (Livro livro : this.livros) {
            System.out.println(livro);
        }
    }

    public Livro buscarLivro(String titulo) {
        for (Livro livro : this.livros) {
            if (livro.getTitulo().equalsIgnoreCase(titulo)) {
                return livro;
            }
        }
        return null;
    }

    public void emprestarLivro(String titulo) {
        Livro livro = buscarLivro(titulo);
        if (livro.isEmprestado()) {
            System.out.println("Livro já emprestado!");
            return;
        }
        if (livro != null) {
            livro.setEmprestado(true);
        }
    }

    public void devolverLivro(String titulo) {
        Livro livro = buscarLivro(titulo);
        if (livro != null) {
            livro.setEmprestado(false);
        }
    }

    public void editarLivro(String titulo, String novoTitulo, String novoAutor, int novoAno) {
        Livro livro = buscarLivro(titulo);
        if (livro != null) {
            livro.setTitulo(novoTitulo);
            livro.setAutor(novoAutor);
            livro.setAno(novoAno);
        }
    }

}
