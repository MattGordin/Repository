package Model;

import java.time.DateTimeException;

public class Ponto {
    private Empregado empregado;
    private String data;
    private DateTimeException horaEntrada;
    private DateTimeException horaSaida;
    private String observacoes;
    private String status;
    private String localizacao;
    private String tipoRegistro;
    private String motivoAtraso;
    private String motivoSaidaAntecipada;
    private String justificativaFalta;
    private String horasExtras;
    private String turno;

    public Ponto() {
        this.empregado = new Empregado();
    }

    public Empregado getEmpregado() {
        return empregado;
    }

    public void setEmpregado(Empregado empregado) {
        this.empregado = empregado;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public DateTimeException getHoraEntrada() {
        return horaEntrada;
    }

    public void setHoraEntrada(DateTimeException horaEntrada) {
        this.horaEntrada = horaEntrada;
    }

    public DateTimeException getHoraSaida() {
        return horaSaida;
    }

    public void setHoraSaida(DateTimeException horaSaida) {
        this.horaSaida = horaSaida;
    }

    public String getObservacoes() {
        return observacoes;
    }

    public void setObservacoes(String observacoes) {
        this.observacoes = observacoes;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getLocalizacao() {
        return localizacao;
    }

    public void setLocalizacao(String localizacao) {
        this.localizacao = localizacao;
    }

    public String getTipoRegistro() {
        return tipoRegistro;
    }

    public void setTipoRegistro(String tipoRegistro) {
        this.tipoRegistro = tipoRegistro;
    }

    public String getMotivoAtraso() {
        return motivoAtraso;
    }

    public void setMotivoAtraso(String motivoAtraso) {
        this.motivoAtraso = motivoAtraso;
    }

    public String getMotivoSaidaAntecipada() {
        return motivoSaidaAntecipada;
    }

    public void setMotivoSaidaAntecipada(String motivoSaidaAntecipada) {
        this.motivoSaidaAntecipada = motivoSaidaAntecipada;
    }

    public String getJustificativaFalta() {
        return justificativaFalta;
    }

    public void setJustificativaFalta(String justificativaFalta) {
        this.justificativaFalta = justificativaFalta;
    }

    public String getHorasExtras() {
        return horasExtras;
    }

    public void setHorasExtras(String horasExtras) {
        this.horasExtras = horasExtras;
    }

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }
}
