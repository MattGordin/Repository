package Control;

public interface CatalogoManagerMBean {

    // Atributos de monitoramento (Read-only)
    public int getNumeroTotalDeFilmes();
    
    // Operações (métodos que podem ser chamados)
    public void adicionarNovoFilme(String titulo, int anoLancamento, String genero, double avaliacao);;
    public String removerFilmePorId(String id);
    public void imprimirTodosOsFilmes();
}