package list.Pesquisa;

import java.util.ArrayList;
import java.util.List;

public class CatalogoLivros {
    private List<Livro> livroList;

    public CatalogoLivros() {
        this.livroList = new ArrayList<>();
    }
    public void adicionarLivro (String titulo, String autor, int anoPublicacao) {
        livroList.add(new Livro(titulo, autor, anoPublicacao));
    }
    public List<Livro> pesquisarPorAutor (String autor) {
        List<Livro> livrosPorAutor = new ArrayList<>();
        if (!livroList.isEmpty()) {
            for(Livro l : livroList) {
                if (l.getAutor().equalsIgnoreCase(autor)) {
                    livrosPorAutor.add(l);
                }
            }

        }
        return livrosPorAutor;
    }
    public List<Livro> pesquisarPorIntervaloAnos (int anoInicial, int anoFinal) {
        List<Livro> LivrosPorIntervaloAno = new ArrayList<>();

        if (!livroList.isEmpty()) {
            for (Livro l : livroList) {
                if(l.getAnoPublicacao() >= anoInicial && l.getAnoPublicacao() <= anoFinal) {
                    LivrosPorIntervaloAno.add(l);
                }
            }
        }
        return LivrosPorIntervaloAno;
    }

    public Livro pesquisarPorTitulo(String titulo) {
        Livro livroPorTitulo = null;
        if(!livroList.isEmpty()) {
            for (Livro l : livroList) {
                if (l.getTitulo().equalsIgnoreCase(titulo)) {
                    livroPorTitulo = l;
                    break;
                }
            }
        }
        return livroPorTitulo;
    }

    public static void main(String[] args) {
        CatalogoLivros catalogoLivros = new CatalogoLivros();
        catalogoLivros.adicionarLivro("Livro 1", "Kauan", 2015);
        catalogoLivros.adicionarLivro("Livro 1", "Kauan", 2016);
        catalogoLivros.adicionarLivro("Livro 2", "Cleber", 2017);
        catalogoLivros.adicionarLivro("Livro 3", "Brenda", 2018);
        catalogoLivros.adicionarLivro("Livro 4", "Julio", 1994);

        System.out.println(catalogoLivros.pesquisarPorAutor("Kauan"));
        System.out.println(catalogoLivros.pesquisarPorIntervaloAnos(2015, 2018));
        System.out.println(catalogoLivros.pesquisarPorTitulo("Livro 1"));
    }
}
