package Control;

public interface ControleTorcedorMBean {

    /**
     * Registra um novo torcedor no sistema.
     * @param nome O nome completo do torcedor.
     * @param cpf O CPF do torcedor, usado como identificador único.
     * @param idade A idade do torcedor.
     * @param nomeTimeCoracao O nome do time de coração do torcedor.
     * @param isSocio Indica se o torcedor é sócio do clube.
     */
    public void registrarTorcedor(String nome, String cpf, int idade, String nomeTimeCoracao, boolean isSocio);

    /**
     * Altera o time do coração de um torcedor.
     * @param cpf O CPF do torcedor.
     * @param novoTime O nome do novo time de coração.
     */
    public void alterarTimeCoracao(String cpf, String novoTime);

    /**
     * Atualiza o status de sócio de um torcedor.
     * @param cpf O CPF do torcedor.
     * @param novoStatusSocio O novo status de sócio (true para sócio, false para não sócio).
     */
    public void atualizarStatusSocio(String cpf, boolean novoStatusSocio);

    /**
     * Remove um torcedor do cadastro.
     * @param cpf O CPF do torcedor a ser removido.
     */
    public void removerTorcedor(String cpf);
}