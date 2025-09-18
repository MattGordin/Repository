package Control;

public interface CatalogoFilmesMBean {
    public int getNumeroTotalDeFilmes();
    public String getFilmeMaisBemAvaliado();
    public void adicionarNovoFilme(String titulo, int ano);
}