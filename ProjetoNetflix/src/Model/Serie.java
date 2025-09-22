package Model;

public class Serie {
    private String id;
    private String titulo;
    private int anoLancamento;
    private String genero;
    private int numeroTemporadas;
    private double avaliacao;

    public Serie(String id, String titulo, int anoLancamento, String genero, int numeroTemporadas, double avaliacao) {
        this.id = id;
        this.titulo = titulo;
        this.anoLancamento = anoLancamento;
        this.genero = genero;
        this.numeroTemporadas = numeroTemporadas;
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

    public int getNumeroTemporadas() {
        return numeroTemporadas;
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

    public void setNumeroTemporadas(int numeroTemporadas) {
        this.numeroTemporadas = numeroTemporadas;
    }

    public void setAvaliacao(double avaliacao) {
        this.avaliacao = avaliacao;
    }
}