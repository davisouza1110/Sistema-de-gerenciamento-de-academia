package interfaceAcademia;

import model.Aluno;
import model.Funcionario;

public interface IAcademia {
    void cadastrarAluno(Aluno aluno);

    void cadastrarFuncionario(Funcionario funcionario);
}
