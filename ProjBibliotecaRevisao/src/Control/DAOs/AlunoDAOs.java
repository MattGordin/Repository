package Control.DAOs;

import Model.Entidade.Aluno;

public class AlunoDAOs {
    public void cadastrarAluno(Aluno aluno){
        String sql = "insert into pessoa (aluno, matricula, curso, periodo, statusMatricula) values ("+ aluno.getAluno() + "," + aluno.getMatricula() + "," + aluno.getCurso() + "," + aluno.getPeriodo() + "," + aluno.getStatusMatricula() +")";
        }
}