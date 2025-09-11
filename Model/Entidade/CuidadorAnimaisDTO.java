package Entidade;

public class CuidadorAnimaisDTO {

    private Pessoa cuidador;
    private String apelido;
    private String classe;

    public CuidadorAnimaisDTO() {
        this.cuidador = new Pessoa();
    }

    public Pessoa getCuidador() {
        return cuidador;
    }

    public void setCuidador(Pessoa cuidador) {
        this.cuidador = cuidador;
    }

    public String getApelido() {
        return apelido;
    }

    public void setApelido(String apelido) {
        this.apelido = apelido;
    }

    public String getClasse() {
        return classe;
    }

    public void setClasse(String classe) {
        this.classe = classe;
    }
}