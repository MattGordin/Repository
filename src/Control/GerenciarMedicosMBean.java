package Control;

import Model.Medico;

public class GerenciarMedicosMBean {
    Medico  medico = new Medico();

    public Medico getMedico() {
        return medico;
    }

    public void setMedico(Medico medico) {
        this.medico = medico;
    }

    //Métodos CRUD
    public boolean cadastrarMedico() {
        boolean result = false;
        String sql = "insert into medicos set nome";
        //sql chama a instrução do banco de dados
        //Retorna true
        result = true;
        return result;
    }

    public Medico consultaMedico(String crm) {
        Medico result = new Medico();
        String sql = "select * from medicos where crm = ?";
        //sql chama a instrução do banco de dados
        //Retorna medico
        //result = Dados retornados do banco
        return result;
    }

    public boolean atualizarDadosMedico(Medico medico, String nome) {
        boolean result = false;
        String sql = "update medicos where nome = ?";
        //sql chama a instrução do banco de dados
        //Retorna true
        result = true;
        return result;
    }

    public boolean apagarRegistroMedico(Medico medico) {
        boolean result = false;
        String sql = "update medicos set ativo (false) where ???";
        //sql chama a instrução do banco de dados
        //Retorna true
        result = true;
        return result;
    }
}