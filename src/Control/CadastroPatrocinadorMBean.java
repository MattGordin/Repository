package Control;

public interface CadastroPatrocinadorMBean {

    /**
     * Adiciona um novo patrocinador ao sistema.
     * @param nome O nome do patrocinador.
     * @param tipoAtividade O tipo de atividade do patrocinador (ex: "Bebidas").
     * @param valorPatrocinio O valor do patrocínio.
     */
    public void adicionarPatrocinador(String nome, String tipoAtividade, double valorPatrocinio);

    /**
     * Atualiza os dados de um patrocinador existente.
     * @param nomeAtual O nome atual do patrocinador.
     * @param novoNome O novo nome do patrocinador.
     * @param novoTipoAtividade O novo tipo de atividade.
     * @param novoValorPatrocinio O novo valor do patrocínio.
     */
    public void atualizarDadosPatrocinador(String nomeAtual, String novoNome, String novoTipoAtividade, double novoValorPatrocinio);
    
    /**
     * Remove um patrocinador do sistema.
     * @param nome O nome do patrocinador a ser removido.
     */
    public void removerPatrocinador(String nome);

    /**
     * Associa um patrocinador a um time.
     * @param nomePatrocinador O nome do patrocinador.
     * @param nomeTime O nome do time a ser patrocinado.
     */
    public void associarPatrocinadorATime(String nomePatrocinador, String nomeTime);
}