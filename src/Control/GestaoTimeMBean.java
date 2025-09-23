package Control;

public interface GestaoTimeMBean {

    /**
     * Cria um novo time no sistema.
     * @param nome O nome do time.
     * @param sigla A sigla do time.
     * @param cidadeSede A cidade sede do time.
     */
    public void criarTime(String nome, String sigla, String cidadeSede);

    /**
     * Adiciona um jogador a um time.
     * @param nomeTime O nome do time ao qual o jogador será adicionado.
     * @param nomeJogador O nome do novo jogador.
     * @param posicao A posição do jogador.
     * @param numeroCamisa O número da camisa do jogador.
     */
    public void adicionarJogadorAoTime(String nomeTime, String nomeJogador, String posicao, int numeroCamisa);

    /**
     * Remove um jogador de um time.
     * @param nomeTime O nome do time.
     * @param nomeJogador O nome do jogador a ser removido.
     */
    public void removerJogadorDoTime(String nomeTime, String nomeJogador);

    /**
     * Adiciona um patrocinador a um time.
     * @param nomeTime O nome do time.
     * @param nomePatrocinador O nome do patrocinador a ser adicionado.
     */
    public void adicionarPatrocinadorAoTime(String nomeTime, String nomePatrocinador);
}