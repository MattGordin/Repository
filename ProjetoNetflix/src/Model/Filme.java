package Model;

public class Filme {
    private String id;
    private String titulo;
    private int anoLancamento;
    private String genero;
    private int duracaoEmMinutos;
    private double avaliacao;

    public Filme(String id, String titulo, int anoLancamento, String genero, int duracaoEmMinutos, double avaliacao) {
        this.id = id;
        this.titulo = titulo;
        this.anoLancamento = anoLancamento;
        this.genero = genero;
        this.duracaoEmMinutos = duracaoEmMinutos;
        this.avaliacao = avaliacao;
    }

    // Getters
    public String getId() {
        return id;
    }

    public String getTitulo() {
        return titulo;
    }

    public int getAnoLancamento() {
        return anoLancamento;
    }

    public String getGenero() {
        return genero;
    }

    public int getDuracaoEmMinutos() {
        return duracaoEmMinutos;
    }

    public double getAvaliacao() {
        return avaliacao;
    }

    // Setters
    public void setId(String id) {
        this.id = id;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAnoLancamento(int anoLancamento) {
        this.anoLancamento = anoLancamento;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public void setDuracaoEmMinutos(int duracaoEmMinutos) {
        this.duracaoEmMinutos = duracaoEmMinutos;
    }

    public void setAvaliacao(double avaliacao) {
        this.avaliacao = avaliacao;
    }

    @Override
    public String toString() {
        return "Filme{" +
               "id='" + id + '\'' +
               ", titulo='" + titulo + '\'' +
               ", anoLancamento=" + anoLancamento +
               ", genero='" + genero + '\'' +
               ", duracaoEmMinutos=" + duracaoEmMinutos +
               ", avaliacao=" + avaliacao +
               '}';
    }
}