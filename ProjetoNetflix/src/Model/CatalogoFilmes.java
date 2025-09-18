package Model;

import java.util.ArrayList;
import java.util.List;

public class CatalogoFilmes implements CatalogoFilmesMBean {
    private List<Filme> filmes = new ArrayList<>();

    public CatalogoFilmes() {
        // Exemplo de filmes iniciais
        filmes.add(new Filme("1", "O Poderoso Chefão", 1972, "Drama", 175, 9.2));
        filmes.add(new Filme("2", "A Origem", 2010, "Ficção Científica", 148, 8.8));
    }

    @Override
    public int getNumeroTotalDeFilmes() {
        return filmes.size();
    }

    @Override
    public String getFilmeMaisBemAvaliado() {
        if (filmes.isEmpty()) {
            return "Nenhum filme no catálogo.";
        }
        Filme melhorFilme = filmes.get(0);
        for (Filme f : filmes) {
            if (f.getAvaliacao() > melhorFilme.getAvaliacao()) {
                melhorFilme = f;
            }
        }
        return melhorFilme.getTitulo() + " (Avaliação: " + melhorFilme.getAvaliacao() + ")";
    }

    @Override
    public void adicionarNovoFilme(String titulo, int ano) {
        // Lógica simples para adicionar um filme
        String novoId = "f" + (filmes.size() + 1);
        filmes.add(new Filme(novoId, titulo, ano, "N/A", 0, 0.0));
        System.out.println("Filme '" + titulo + "' adicionado ao catálogo.");
    }
    
    // Método para recuperar a lista de filmes (não faz parte do MBean)
    public List<Filme> getFilmes() {
        return filmes;
    }
}