package Model;

import java.util.ArrayList;
import java.util.List;

public class Usuario {
    private String id;
    private String nome;
    private String email;
    private List<Filme> minhaListaDeFilmes;
    private List<Serie> minhaListaDeSeries;

    public Usuario(String id, String nome, String email) {
        this.id = id;
        this.nome = nome;
        this.email = email;
        this.minhaListaDeFilmes = new ArrayList<>();
        this.minhaListaDeSeries = new ArrayList<>();
    }

    // Getters
    public String getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }

    public List<Filme> getMinhaListaDeFilmes() {
        return minhaListaDeFilmes;
    }

    public List<Serie> getMinhaListaDeSeries() {
        return minhaListaDeSeries;
    }

    // Setters
    public void setId(String id) {
        this.id = id;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    // Métodos para gerenciar a lista
    public void adicionarFilme(Filme filme) {
        this.minhaListaDeFilmes.add(filme);
    }

    public void adicionarSerie(Serie serie) {
        this.minhaListaDeSeries.add(serie);
    }

    @Override
    public String toString() {
        return "Usuario{" +
               "id='" + id + '\'' +
               ", nome='" + nome + '\'' +
               ", email='" + email + '\'' +
               ", minhaListaDeFilmes=" + minhaListaDeFilmes.size() + " filmes" +
               ", minhaListaDeSeries=" + minhaListaDeSeries.size() + " series" +
               '}';
    }
}