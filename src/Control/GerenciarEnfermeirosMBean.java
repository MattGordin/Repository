package Control;

import Model.Enfermeiro;

public class GerenciarEnfermeirosMBean {
    Enfermeiro  enfermeiro = new Enfermeiro();

    public Enfermeiro getEnfermeiro() {
        return enfermeiro;
    }

    public void setEnfermeiro(Enfermeiro enfermeiro) {
        this.enfermeiro = enfermeiro;
    }

    //Métodos CRUD
    public boolean cadastrarEnfermeiro() {
        boolean result = false;
        String sql = "insert into Enfermeiros set nome";
        //sql chama a instrução do banco de dados
        //Retorna true
        result = true;
        return result;
    }

    public Enfermeiro consultaEnfermeiro(String coren) {
        Enfermeiro result = new Enfermeiro();
        String sql = "select * from Enfermeiros where crm = ?";
        //sql chama a instrução do banco de dados
        //Retorna Enfermeiro
        //result = Dados retornados do banco
        return result;
    }

    public boolean atualizarDadosEnfermeiro(Enfermeiro enfermeiro, String nome) {
        boolean result = false;
        String sql = "update Enfermeiros where nome = ?";
        //sql chama a instrução do banco de dados
        //Retorna true
        result = true;
        return result;
    }

    public boolean apagarRegistroEnfermeiro(Enfermeiro enfermeiro) {
        boolean result = false;
        String sql = "update Enfermeiros set ativo (false) where ???";
        //sql chama a instrução do banco de dados
        //Retorna true
        result = true;
        return result;
    }
}