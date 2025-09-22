package Model;

import java.util.ArrayList;
import java.util.List;

public class CatalogoFilmes {

    private List<Filme> filmes = new ArrayList<>();

    // Construtor com alguns dados iniciais
    public CatalogoFilmes() {
        filmes.add(new Filme("F001", "O Poderoso Chefão", 1972, "Drama", 175, 9.2));
        filmes.add(new Filme("F002", "A Origem", 2010, "Ficção Científica", 148, 8.8));
        filmes.add(new Filme("F003", "Jurassic Park", 1993, "Aventura", 127, 8.2));
    }

    // Getter para a lista de filmes
    public List<Filme> getFilmes() {
        return filmes;
    }

    // Setter para a lista de filmes
    public void setFilmes(List<Filme> filmes) {
        this.filmes = filmes;
    }
}