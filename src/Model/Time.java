package Model;

import java.util.List;

public class Time {
    private int idTime;
    private String nomeTime;
    private String sigla;
    private String cidadeSede;
    private String tecnico;
    private String presidente;
    
    List<Jogador> jogadores;
    List<Patrocinador> patrocinadores;
    List<Partida> historicoPartidas;
}
