package service;


import interfaceAcademia.IAcademia;
import model.Aluno;
import model.Funcionario;

import java.util.ArrayList;
import java.util.List;

public class AcademiaService implements IAcademia {
    private List<Aluno> alunos;
    private List<Funcionario> funcionarios;

    public AcademiaService() {
        this.alunos = new ArrayList<>();
        this.funcionarios = new ArrayList<>();
    }

    @Override
    public void cadastrarAluno(Aluno aluno) {
        alunos.add(aluno);
        System.out.println("model.Aluno cadastrado: " + aluno.getNome());
    }

    @Override
    public void cadastrarFuncionario(Funcionario funcionario) {
        funcionarios.add(funcionario);
        System.out.println("Funcionário cadastrado: " + funcionario.getNome());
    }

    public void listarAlunos() {
        System.out.println("Lista de alunos:");
        for (Aluno aluno : alunos) {
            System.out.println(aluno);
        }
    }

    public void listarFuncionarios() {
        System.out.println("Lista de funcionários:");
        for (Funcionario funcionario : funcionarios) {
            System.out.println(funcionario.getNome());
        }
    }
}
