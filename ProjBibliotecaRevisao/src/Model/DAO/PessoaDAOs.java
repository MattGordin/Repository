package Model.DAO;

import Model.Entidade.Pessoa;

public class PessoaDAOs {
    public void cadastrarPessoa(Pessoa pessoa){
        String sql = "insert into pessoa (nome, cpf, telefone, endereco, email, dataNascimento, sexo) values ("+ pessoa.getNome() + "," + pessoa.getCpf() + "," + pessoa.getTelefone() + "," + pessoa.getEndereco() + "," + pessoa.getEmail() + "," + pessoa.getDataNascimento() + "," + pessoa.getSexo() +")";
    }
}