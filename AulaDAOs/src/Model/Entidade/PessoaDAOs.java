package Model.Entidade;

public class PessoaDAOs {
    public void cadastrarPessoa(Pessoa pessoa){
        String sql = "insert into pessoa (idPessoa, nome, cpf, telefone, endereco, email, dataNascimento, sexo) values ("+ pessoa.getIdPessoa() + "," + pessoa.getNome() + "," + pessoa.getCpf() + "," + pessoa.getTelefone() + "," + pessoa.getEndereco() + "," + pessoa.getEmail() + "," + pessoa.getDataNascimento() + "," + pessoa.getSexo() +")";
    }
}