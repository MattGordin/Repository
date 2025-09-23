package Model;

import java.sql.Date;
import java.util.List;

public class Partida {
    private int idPartida;
    private Time timeCasa;
    private Time timeVisitante;
    private Date data;
    private String local;
    private int placarTimeCasa;
    private int placarTimeVisitante;
    
    List<Jogador> jogadoresEmCampo;
}