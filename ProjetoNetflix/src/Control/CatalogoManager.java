package Control;

import java.util.List;

import Model.CatalogoFilmes;
import Model.Filme;

public class CatalogoManager implements CatalogoManagerMBean {

    private CatalogoFilmes catalogo;

    public CatalogoManager(CatalogoFilmes catalogo) {
        this.catalogo = catalogo;
    }

    public int getNumeroTotalDeFilmes() {
        return catalogo.getFilmes().size();
    }
    
    public void adicionarNovoFilme(String titulo, int anoLancamento, String genero, double avaliacao) {
        List<Filme> filmes = catalogo.getFilmes();
        String novoId = "F" + (filmes.size() + 1);
        filmes.add(new Filme(novoId, titulo, anoLancamento, genero, 0, avaliacao));
        System.out.println("Filme '" + titulo + "' adicionado com sucesso. ID: " + novoId);
    }
    
    public String removerFilmePorId(String id) {
        boolean removido = catalogo.getFilmes().removeIf(f -> f.getId().equals(id));
        if (removido) {
            return "Filme com ID '" + id + "' removido com sucesso.";
        }
        return "Nenhum filme encontrado com o ID '" + id + "'.";
    }

    public void imprimirTodosOsFilmes() {
        catalogo.getFilmes().forEach(f -> System.out.println(f.toString()));
    }
}